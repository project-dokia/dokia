import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { Lot } from '../../../models/lot';

import { LotService } from '../../../services/lot.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

import {Location} from '@angular/common';

@Component({
  selector: 'app-list-lot',
  templateUrl: './list-lot.component.html',
  styleUrls: ['./list-lot.component.scss'],
  // declarations: [ListLotPipe],
  providers: [LotService],
  animations: [routerTransition(), elementTransition()]
})
export class ListLotComponent implements OnInit {
  listLot: Lot[];
 
  
  constructor(
    private _location: Location,
    private router: Router,
    private lotService: LotService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.getListLot();
    
  }

  public backLocation() {
    this._location.back();
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
