import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Cost } from '../../../models/cost';

import { CostService } from '../../../services/cost.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

@Component({
  selector: 'app-list-cost',
  templateUrl: './list-cost.component.html',
  styleUrls: ['./list-cost.component.scss'],
  // declarations: [ListCostPipe],
  providers: [CostService],
  animations: [routerTransition(), elementTransition()]
})
export class ListCostComponent implements OnInit {
  listCost: Cost[];
  
  constructor(
    private costService: CostService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.listCost = new Array<Cost>();
    this.getListCost();
  }

  public getListCost() {
    this.costService.getCostObservable()
    .subscribe( listCost => {

        this.listCost = listCost;

    },
    err => {
      console.log(err);
    });

  }
}
