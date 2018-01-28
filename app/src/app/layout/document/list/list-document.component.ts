import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { DocSend } from '../../../models/docSend';

import { DocumentService } from '../../../services/document.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

@Component({
  selector: 'app-list-document',
  templateUrl: './list-document.component.html',
  styleUrls: ['./list-document.component.scss'],
  // declarations: [ListDocumentPipe],
  providers: [DocumentService],
  animations: [routerTransition(), elementTransition()]
})
export class ListDocumentComponent implements OnInit {
  listDocSend: DocSend[];
  idWallet: string;
  idCompany:string;
  idUser:string;
  idProcess:string;
  idExpense:string;
  
  constructor(
    private router: Router,
    private documentService: DocumentService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.listDocSend = new Array<DocSend>();
    
    this.idWallet  = this.router.url.split('wallet/').pop().split('/user').shift();
    this.idCompany = this.router.url.split('company/').pop().split('/wallet').shift();
    this.idUser = this.router.url.split('user/').pop().split('/process').shift();
    this.idProcess = this.router.url.split('process/').pop().split('/expense').shift();
    this.idExpense = this.router.url.split('expense/').pop().split('/document').shift();

    this.getListDocument();
    
  }

  public getListDocument() {
    this.documentService.getDocumentsByIDExpenseObservable(this.idExpense)
    .subscribe( listDocSend => {
      this.listDocSend = listDocSend;
    },
    err => {
      console.log(err);
    });

  }
}
