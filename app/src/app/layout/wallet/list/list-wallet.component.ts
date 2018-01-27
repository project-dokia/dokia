import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { Router } from '@angular/router';
import { Wallet } from '../../../models/wallet';

import { WalletService } from '../../../services/wallet.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

@Component({
  selector: 'app-list-wallet',
  templateUrl: './list-wallet.component.html',
  styleUrls: ['./list-wallet.component.scss'],
  // declarations: [ListWalletPipe],
  providers: [WalletService],
  animations: [routerTransition(), elementTransition()]
})
export class ListWalletComponent implements OnInit {
  listWallet: Wallet[];
  idCompany: String;

  constructor(
    private router: Router,
    private walletService: WalletService,
    private modalService: NgbModal) {}

  ngOnInit() : void {

    this.idCompany = this.router.url;
    this.idCompany = (this.router.url).replace("/company", "");
    this.idCompany = (this.idCompany).replace("/", "");
    this.idCompany = (this.idCompany).replace("/wallets", "");

    this.listWallet = new Array<Wallet>();
    if(this.idCompany != null && this.idCompany != undefined) {
      this.getListWallet();
    }
  }

  public getListWallet() {
    this.walletService.getWalletByIDCompanyObservable(this.idCompany)
    .subscribe( listWallet => {

        this.listWallet = listWallet;

    },
    err => {
      console.log(err);
    });

  }
}
