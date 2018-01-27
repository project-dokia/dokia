import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Company } from '../../../models/company';

import { CompanyService } from '../../../services/company.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

@Component({
  selector: 'app-list-company',
  templateUrl: './list-company.component.html',
  styleUrls: ['./list-company.component.scss'],
  // declarations: [ListCompanyPipe],
  providers: [CompanyService],
  animations: [routerTransition(), elementTransition()]
})
export class ListCompanyComponent implements OnInit {
  listCompany: Company[];
  
  constructor(
    private companyService: CompanyService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.listCompany = new Array<Company>();
    this.getListCompany();
  }

  public getListCompany() {
    this.companyService.getCompanyObservable()
    .subscribe( listCompany => {

        this.listCompany = listCompany;

    },
    err => {
      console.log(err);
    });

  }
}
