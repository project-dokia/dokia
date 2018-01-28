import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListLotComponent } from './list-lot.component';

const routes: Routes = [
    { path: '', component: ListLotComponent }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ListLotRoutingModule { }