import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListRuleComponent } from './list-rule.component';

const routes: Routes = [
    { path: '', component: ListRuleComponent }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ListRuleRoutingModule { }