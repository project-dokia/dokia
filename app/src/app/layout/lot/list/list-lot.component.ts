import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { DocSend } from '../../../models/docSend';

import { LotService } from '../../../services/lot.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

@Component({
  selector: 'app-list-lot',
  templateUrl: './list-lot.component.html',
  styleUrls: ['./list-lot.component.scss'],
  // declarations: [ListLotPipe],
  providers: [LotService],
  animations: [routerTransition(), elementTransition()]
})
export class ListLotComponent implements OnInit {
  listLot: DocSend[];
 
  
  constructor(
    private router: Router,
    private lotService: LotService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.getListLot();
    
  }

  public getListLot() {
    this.lotService.getLotObservable()
    .subscribe( listLot => {
      this.listLot = listLot;
    },
    err => {
      console.log(err);
    });

  }
}
