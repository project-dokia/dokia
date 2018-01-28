import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { Expense } from '../../models/expense';
import { ExpenseService } from '../../services/expense.service';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-expense',
  templateUrl: './expense.component.html',
  styleUrls: ['./expense.component.scss'],
  // declarations: [ExpensePipe],
  providers: [ExpenseService],
  animations: [routerTransition(), elementTransition()]
})

export class ExpenseComponent implements OnInit {
  expense: Expense;
  idWallet: string;
  idCompany: string;
  idUser:string;
  idProcess:string;
  
  constructor(
    private router: Router,
    private expenseService: ExpenseService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.expense = new Expense();
    this.idWallet = this.router.url.split('wallet/').pop().split('/user').shift();
    this.idCompany = this.router.url.split('company/').pop().split('/wallet').shift();
    this.idUser = this.router.url.split('user/').pop().split('/process').shift();
    this.idProcess = this.router.url.split('process/').pop().split('/expense').shift();

    this.expense.idProcess = this.idProcess;
  }

  public addExpense() {
    this.expenseService.addExpenseWithObservable(this.expense)
    .subscribe( res => {

      alert("Adicionado!");
      this.expense = new Expense();    
    },
    err => {
      console.log(err);
    });

  }
}
