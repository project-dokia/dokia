import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { Wallet } from '../../models/wallet';

import { WalletService } from '../../services/wallet.service';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-wallet',
  templateUrl: './wallet.component.html',
  styleUrls: ['./wallet.component.scss'],
  // declarations: [WalletPipe],
  providers: [WalletService],
  animations: [routerTransition(), elementTransition()]
})

export class WalletComponent implements OnInit {
  wallet: Wallet;
  idCompany: string;

  constructor(
    private router: Router,
    private walletService: WalletService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.wallet = new Wallet();

    this.idCompany = this.router.url;


    this.idCompany = this.router.url.split('company/').pop().split('/wallet/add').shift();
    

    this.wallet.idCompany = this.idCompany;
  }

  public addWallet() {
    this.walletService.addWalletWithObservable(this.wallet)
    .subscribe( res => {

      alert("Adicionado!");
      this.wallet = new Wallet();    
    },
    err => {
      console.log(err);
    });

  }
}
