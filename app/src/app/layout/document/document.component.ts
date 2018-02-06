import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { Document } from '../../models/document';
import {Observable} from 'rxjs/Observable';
import { Router } from '@angular/router';
import { DocumentService } from '../../services/document.service';
import { LotService } from '../../services/lot.service';
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
import { Lot } from 'app/models/lot';

import {Location} from '@angular/common';
@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.scss'],
  // declarations: [DocumentPipe],
  providers: [DocumentService, ProcessService, ExpenseService, WalletService, UserService, CompanyService, LotService],
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
  idDocument: String;
  lot: Lot;

  constructor(
    private _location: Location,
    private httpClient: HttpClient,
    private router: Router,
    private documentService: DocumentService,
    private lotService: LotService,
    private processService: ProcessService,
    private expenseService: ExpenseService,
    private walletService: WalletService,
    private userService: UserService,
    private companyService: CompanyService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.document = new Document();
    this.docSend = new DocSend;

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

    this.docSend.cpf = "45084552802";
    this.docSend.lot = "123";
    this.docSend.requestedValue = "R$10,50";
    this.docSend.approveRule = "false";
    this.docSend.approvePerson = "false";

    this.getInfos();
  }

  public handleFileInput(files: FileList) {
    this.fileToUpload = files.item(0);
    console.log(this.fileToUpload);
  }

  public uploadFileToActivity() {
    this.addDocument();  
  }

  public postFile(fileToUpload: File): Observable<Object> {
    this.docSend.process = this.process;
    this.docSend.company = this.company;
    this.docSend.user = this.user;
    this.docSend.expense = this.expense;
    this.docSend.wallet = this.wallet;
    this.docSend.idExpense = this.idExpense;

    const endpoint = 'https://dokia-ocr.herokuapp.com/upload_doc';
    const formData: FormData = new FormData();
    formData.append('fileKey', fileToUpload, fileToUpload.name);
    formData.set("docSend",  JSON.stringify(this.docSend));

    return this.httpClient
      .post(endpoint, formData)
      .map(() => { return true; })
      .catch((e) => this.handleError(e));
  }

  public backLocation() {
    this._location.back();
  }

  public handleError(error: any): Promise<any> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }

  open(content) : void{
    this.modalService.open(content, { backdrop: 'static', size: 'lg' });
  }

  openModal(content, _id) : void{
    // this.getLogsUser(content, _id);
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return  `with: ${reason}`;
    }
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
    this.docSend.status = "WAIT";
    this.documentService.addDocumentWithObservable(this.docSend)
    .subscribe( res => {
      this.postFile(this.fileToUpload).subscribe(data => {
        this.docSend._id = data.toString();
        alert("Adicionado!");
        this.process = new Process();   

      this.backLocation(); 
      }, error => {
        console.log(error);
      });
    },
    err => {
      console.log(err);
    });
  
    this.lot = new Lot;
    this.lot.code = this.docSend.lot;
    
    this.lotService.addLotWithObservable(this.lot)
      .subscribe( res => {
        }, error => {
          console.log(error);
        });
    }
}
