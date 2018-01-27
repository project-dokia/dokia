import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { Wallet } from '../../models/wallet';

import { CompanyService } from '../../services/wallet.service';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-wallet',
  templateUrl: './wallet.component.html',
  styleUrls: ['./wallet.component.scss'],
  // declarations: [CompanyPipe],
  providers: [CompanyService],
  animations: [routerTransition(), elementTransition()]
})

export class CompanyComponent implements OnInit {
  wallet: Wallet;
  
  constructor(
    private walletService: CompanyService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.wallet = new Wallet();
  }

  public addCompany() {
    this.walletService.addCompanyWithObservable(this.wallet)
    .subscribe( res => {

      alert("Adicionado!");
      this.wallet = new Wallet();    
    },
    err => {
      console.log(err);
    });

  }
}
