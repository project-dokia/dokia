import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { User } from '../../../models/user';

import { UserService } from '../../../services/user.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.scss'],
  // declarations: [ListUserPipe],
  providers: [UserService],
  animations: [routerTransition(), elementTransition()]
})
export class ListUserComponent implements OnInit {
  listUser: User[];
  idWallet: string;
  idCompany:string;
  
  constructor(
    private router: Router,
    private userService: UserService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.listUser = new Array<User>();
    
    this.idWallet  = this.router.url.split('wallet/').pop().split('/users').shift();
    this.idCompany = this.router.url.split('company/').pop().split('/wallet').shift();
    
    this.getListUser();
    
  }

  public getListUser() {
    this.userService.getUsersByIDWalletObservable(this.idWallet)
    .subscribe( listUser => {

        this.listUser = listUser;

    },
    err => {
      console.log(err);
    });

  }
}
