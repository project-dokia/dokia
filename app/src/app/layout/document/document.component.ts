import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { Document } from '../../models/document';

import { DocumentService } from '../../services/document.service';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.scss'],
  // declarations: [DocumentPipe],
  providers: [DocumentService],
  animations: [routerTransition(), elementTransition()]
})

export class DocumentComponent implements OnInit {
  document: Document;
  
  constructor(
    private documentService: DocumentService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.document = new Document();
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
