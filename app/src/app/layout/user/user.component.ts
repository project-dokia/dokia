import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
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
  idWallet: string;
  idCompany: string;
  
  constructor(
    private router: Router,
    private userService: UserService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.user = new User();
    this.idWallet = this.router.url.split('wallet/').pop().split('/user/add').shift();

    this.idCompany = this.router.url.split('company/').pop().split('/wallet').shift();

    this.user.idWallet = this.idWallet;
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
