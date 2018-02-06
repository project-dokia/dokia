import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { Company } from '../../models/company';

import { CompanyService } from '../../services/company.service';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

import {Location} from '@angular/common';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.scss'],
  // declarations: [CompanyPipe],
  providers: [CompanyService],
  animations: [routerTransition(), elementTransition()]
})

export class CompanyComponent implements OnInit {
  company: Company;
  
  constructor(
    private _location: Location,
    private companyService: CompanyService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.company = new Company();
  }

 

  public backLocation() {
    this._location.back();
  }

  public addCompany() {
    this.companyService.addCompanyWithObservable(this.company)
    .subscribe( res => {

      alert("Adicionado!");
      this.company = new Company();   
      this.backLocation(); 
    },
    err => {
      console.log(err);
    });

  }
}
