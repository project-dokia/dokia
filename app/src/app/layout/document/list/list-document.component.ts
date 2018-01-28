import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { Document } from '../../../models/document';

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
  listDocument: Document[];
  idWallet: string;
  idCompany:string;
  idUser:string;
  idProcess:string;
  
  constructor(
    private router: Router,
    private documentService: DocumentService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.listDocument = new Array<Document>();
    
    this.idWallet  = this.router.url.split('wallet/').pop().split('/user').shift();
    this.idCompany = this.router.url.split('company/').pop().split('/wallet').shift();
    this.idUser = this.router.url.split('user/').pop().split('/process').shift();
    this.idProcess = this.router.url.split('process/').pop().split('/document').shift();

    this.getListDocument();
    
  }

  public getListDocument() {
    this.documentService.getDocumentsByIDWalletObservable(this.idProcess)
    .subscribe( listDocument => {
      this.listDocument = listDocument;
    },
    err => {
      console.log(err);
    });

  }
}
