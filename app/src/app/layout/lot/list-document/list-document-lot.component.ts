import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { DocSend } from '../../../models/docSend';

import { DocumentService } from '../../../services/document.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

import {Location} from '@angular/common';

@Component({
  selector: 'app-list-document',
  templateUrl: './list-document-lot.component.html',
  styleUrls: ['./list-document-lot.component.scss'],
  // declarations: [ListLotDocumentPipe],
  providers: [DocumentService],
  animations: [routerTransition(), elementTransition()]
})
export class ListLotDocumentComponent implements OnInit {
  listDocSend: DocSend[];
  idLot:string;
  
  constructor(
    private _location: Location,
    private router: Router,
    private documentService: DocumentService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.listDocSend = new Array<DocSend>();
    
    this.idLot = this.router.url;
    this.idLot = (this.router.url).replace("/lot", "");
    this.idLot = (this.idLot).replace("/", "");

    this.getListLotDocument();
    
  }

  public backLocation() {
    this._location.back();
  }

  public getListLotDocument() {
    this.documentService.getDocumentsByIDLotObservable(this.idLot)
    .subscribe( listDocSend => {
      this.listDocSend = listDocSend;
    },
    err => {
      console.log(err);
    });

  }
}
