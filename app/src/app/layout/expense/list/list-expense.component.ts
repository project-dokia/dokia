import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { Expense } from '../../../models/expense';

import { ExpenseService } from '../../../services/expense.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

import {Location} from '@angular/common';

@Component({
  selector: 'app-list-expense',
  templateUrl: './list-expense.component.html',
  styleUrls: ['./list-expense.component.scss'],
  // declarations: [ListExpensePipe],
  providers: [ExpenseService],
  animations: [routerTransition(), elementTransition()]
})
export class ListExpenseComponent implements OnInit {
  listExpense: Expense[];
  idWallet: string;
  idCompany:string;
  idUser:string;
  idProcess:string;
  
  constructor(
    private _location: Location,
    private router: Router,
    private expenseService: ExpenseService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.listExpense = new Array<Expense>();
    
    this.idWallet  = this.router.url.split('wallet/').pop().split('/user').shift();
    this.idCompany = this.router.url.split('company/').pop().split('/wallet').shift();
    this.idUser = this.router.url.split('user/').pop().split('/process').shift();
    this.idProcess = this.router.url.split('process/').pop().split('/expense').shift();

    this.getListExpense();
    
  }

  public backLocation() {
    this._location.back();
  }

  public getListExpense() {
    this.expenseService.getExpensesByIDWalletObservable(this.idProcess)
    .subscribe( listExpense => {
      this.listExpense = listExpense;
      
    },
    err => {
      console.log(err);
    });

  }
}
