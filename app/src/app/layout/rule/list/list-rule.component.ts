import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


import { Rule } from '../../../models/rule';

import { RuleService } from '../../../services/rule.service';

import { elementTransition } from '../../../element.animations';
import { routerTransition } from '../../../router.animations';

@Component({
  selector: 'app-list-rule',
  templateUrl: './list-rule.component.html',
  styleUrls: ['./list-rule.component.scss'],
  // declarations: [ListRulePipe],
  providers: [RuleService],
  animations: [routerTransition(), elementTransition()]
})
export class ListRuleComponent implements OnInit {
  listRule: Rule[];
  
  constructor(
    private ruleService: RuleService,
    private modalService: NgbModal) {}

  ngOnInit() : void {
    this.listRule = new Array<Rule>();
    this.getListRule();
  }

  public getListRule() {
    this.ruleService.getRuleObservable()
    .subscribe( listRule => {

        this.listRule = listRule;

    },
    err => {
      console.log(err);
    });

  }
}
