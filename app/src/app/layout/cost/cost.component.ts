import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { Cost } from '../../models/cost';

import { CompanyService } from '../../services/cost.service';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-cost',
  templateUrl: './cost.component.html',
  styleUrls: ['./cost.component.scss'],
  // declarations: [CompanyPipe],
  providers: [CompanyService],
  animations: [routerTransition(), elementTransition()]
})

export class CompanyComponent implements OnInit {
  cost: Cost;
  
  constructor(
    private costService: CompanyService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.cost = new Cost();
  }

  public addCompany() {
    this.costService.addCompanyWithObservable(this.cost)
    .subscribe( res => {

      alert("Adicionado!");
      this.cost = new Cost();    
    },
    err => {
      console.log(err);
    });

  }
}
