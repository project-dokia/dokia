import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import { Rule } from '../../models/rule';

import { RuleService } from '../../services/rule.service';

import { elementTransition } from '../../element.animations';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-rule',
  templateUrl: './rule.component.html',
  styleUrls: ['./rule.component.scss'],
  // declarations: [RulePipe],
  providers: [RuleService],
  animations: [routerTransition(), elementTransition()]
})

export class RuleComponent implements OnInit {
  rule: Rule;
  
  constructor(
    private ruleService: RuleService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.rule = new Rule();
  }

  public addRule() {
    this.ruleService.addRuleWithObservable(this.rule)
    .subscribe( res => {

      alert("Adicionado!");
      this.rule = new Rule();    
    },
    err => {
      console.log(err);
    });

  }
}
