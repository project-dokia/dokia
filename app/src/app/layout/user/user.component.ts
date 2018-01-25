import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { User } from '../../models/user';

import { UserService } from '../../services/user.service';
import { UserPipe } from './user.pipe';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss'],
  // declarations: [UserPipe],
  providers: [UserService],
  animations: [routerTransition(), elementTransition()]
})

export class UserComponent implements OnInit {
  user: User;
  
  constructor(
    private userService: UserService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.user = new User();
  }

  public addUser() {
    this.userService.addUserWithObservable(this.user)
    .subscribe( res => {

      alert("Adicionado!");
      this.user = new User();    
    },
    err => {
      console.log(err);
    });

  }
}
