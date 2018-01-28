import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { Document } from '../../models/document';
import {Observable} from 'rxjs/Observable';
import { Router } from '@angular/router';
import { DocumentService } from '../../services/document.service';
import { ProcessService } from '../../services/process.service';
import { ExpenseService } from '../../services/expense.service';
import { WalletService } from '../../services/wallet.service';
import { UserService } from '../../services/user.service';
import { CompanyService } from '../../services/company.service';
import { Headers, Http, Response, RequestOptions } from '@angular/http';

import { HttpClientModule, HttpClient } from '@angular/common/http';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

import { Process } from 'app/models/process';
import { User } from 'app/models/user';
import { Company } from 'app/models/company';
import { Expense } from 'app/models/expense';
import { Wallet } from 'app/models/wallet';
import { DocSend } from 'app/models/docsend';


@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.scss'],
  // declarations: [DocumentPipe],
  providers: [DocumentService, ProcessService, ExpenseService, WalletService, UserService, CompanyService],
  animations: [routerTransition(), elementTransition()]
})

export class DocumentComponent implements OnInit {
  document: Document;
  idWallet: string;
  idCompany:string;
  idUser:string;
  idProcess:string;
  idExpense:string;
  process: Process;
  company: Company;
  user: User;
  expense: Expense;
  wallet: Wallet;
  fileToUpload: File = null;
  docSend: DocSend;

  constructor(
    private httpClient: HttpClient,
    private router: Router,
    private documentService: DocumentService,
    private processService: ProcessService,
    private expenseService: ExpenseService,
    private walletService: WalletService,
    private userService: UserService,
    private companyService: CompanyService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.document = new Document();

    this.idWallet  = this.router.url.split('wallet/').pop().split('/user').shift();
    this.idCompany = this.router.url.split('company/').pop().split('/wallet').shift();
    this.idUser = this.router.url.split('user/').pop().split('/process').shift();
    this.idProcess = this.router.url.split('process/').pop().split('/expense').shift();
    this.idExpense = this.router.url.split('expense/').pop().split('/document').shift();

    this.process = new Process;
    this.company = new Company;
    this.user = new User;
    this.expense = new Expense;
    this.wallet = new Wallet;

    this.getInfos();
  }

  public handleFileInput(files: FileList) {
    this.fileToUpload = files.item(0);
  }

  public uploadFileToActivity() {
    this.postFile(this.fileToUpload).subscribe(data => {
      // do something, if upload success
      }, error => {
        console.log(error);
      });
  }

  public postFile(fileToUpload: File): Observable<Object> {
    this.docSend = new DocSend;

    this.docSend.process = this.process;
    this.docSend.company = this.company;
    this.docSend.user = this.user;
    this.docSend.expense = this.expense;
    this.docSend.wallet = this.wallet;
    this.docSend.cpf = "45084552802";
    this.docSend.lot = "123";

    const endpoint = 'https://dokia-ocr.herokuapp.com/upload_doc';
    const formData: FormData = new FormData();
    formData.append('fileKey', fileToUpload, fileToUpload.name);
    formData.set("docSend",  JSON.stringify(this.docSend));

    return this.httpClient
      .post(endpoint, formData)
      .map(() => { return true; })
      .catch((e) => this.handleError(e));
  }

  public handleError(error: any): Promise<any> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }

  public getInfos() : void {
    this.processService.getProcesssByIDObservable(this.idProcess)
    .subscribe( process => {
      this.process = process;
    },
    err => {
      console.log(err);
    });

    this.companyService.getCompanyByIDObservable(this.idCompany)
    .subscribe( company => {
      this.company = company;
    },
    err => {
      console.log(err);
    });

    this.userService.getUserByIDObservable(this.idUser)
    .subscribe( user => {
      this.user = user;
    },
    err => {
      console.log(err);
    });

    this.expenseService.getExpensesByIDObservable(this.idExpense)
    .subscribe( expense => {
      this.expense = expense;
    },
    err => {
      console.log(err);
    });

    this.walletService.getWalletByIDObservable(this.idWallet)
    .subscribe( wallet => {
      this.wallet = wallet;
    },
    err => {
      console.log(err);
    });
  }  

  public addDocument() {
    this.documentService.addDocumentWithObservable(this.document)
    .subscribe( res => {

      alert("Adicionado!");
      this.document = new Document();    
    },
    err => {
      console.log(err);
    });

  }
}
