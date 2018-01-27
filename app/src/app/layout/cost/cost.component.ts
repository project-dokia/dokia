import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { Cost } from '../../models/cost';

import { CostService } from '../../services/cost.service';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-cost',
  templateUrl: './cost.component.html',
  styleUrls: ['./cost.component.scss'],
  // declarations: [CostPipe],
  providers: [CostService],
  animations: [routerTransition(), elementTransition()]
})

export class CostComponent implements OnInit {
  cost: Cost;
  
  constructor(
    private costService: CostService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.cost = new Cost();
  }

  public addCost() {
    this.costService.addCostWithObservable(this.cost)
    .subscribe( res => {

      alert("Adicionado!");
      this.cost = new Cost();    
    },
    err => {
      console.log(err);
    });

  }
}
