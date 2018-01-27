import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListCostComponent } from './list-cost.component';

const routes: Routes = [
    { path: '', component: ListCostComponent }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ListCostRoutingModule { }