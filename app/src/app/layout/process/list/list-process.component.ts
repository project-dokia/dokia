import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { Process } from '../../../models/process';

import { ProcessService } from '../../../services/process.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

@Component({
  selector: 'app-list-process',
  templateUrl: './list-process.component.html',
  styleUrls: ['./list-process.component.scss'],
  // declarations: [ListProcessPipe],
  providers: [ProcessService],
  animations: [routerTransition(), elementTransition()]
})
export class ListProcessComponent implements OnInit {
  listProcess: Process[];
  idWallet: string;
  idCompany:string;
  idUser:string;
  
  constructor(
    private router: Router,
    private processService: ProcessService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.listProcess = new Array<Process>();
    
    this.idWallet  = this.router.url.split('wallet/').pop().split('/user').shift();
    this.idCompany = this.router.url.split('company/').pop().split('/wallet').shift();
    this.idUser = this.router.url.split('user/').pop().split('/process').shift();
    
    this.getListProcess();
    
  }

  public getListProcess() {
    this.processService.getProcesssByIDWalletObservable(this.idWallet)
    .subscribe( listProcess => {
      this.listProcess = listProcess;
    },
    err => {
      console.log(err);
    });

  }
}
