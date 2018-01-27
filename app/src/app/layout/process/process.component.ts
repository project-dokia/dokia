import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Router } from '@angular/router';
import { Process } from '../../models/process';
import { ProcessService } from '../../services/process.service';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-process',
  templateUrl: './process.component.html',
  styleUrls: ['./process.component.scss'],
  // declarations: [ProcessPipe],
  providers: [ProcessService],
  animations: [routerTransition(), elementTransition()]
})

export class ProcessComponent implements OnInit {
  process: Process;
  idWallet: string;
  idCompany: string;
  idUser:string;
  
  constructor(
    private router: Router,
    private processService: ProcessService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.process = new Process();
    this.idWallet = this.router.url.split('wallet/').pop().split('/user').shift();
    this.idCompany = this.router.url.split('company/').pop().split('/wallet').shift();
    this.idUser = this.router.url.split('user/').pop().split('/process').shift();

    this.process.idUser = this.idUser;
  }

  public addProcess() {
    this.processService.addProcessWithObservable(this.process)
    .subscribe( res => {

      alert("Adicionado!");
      this.process = new Process();    
    },
    err => {
      console.log(err);
    });

  }
}
