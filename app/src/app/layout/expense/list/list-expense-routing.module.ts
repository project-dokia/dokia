import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListExpenseComponent } from './list-expense.component';

const routes: Routes = [
    { path: '', component: ListExpenseComponent }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ListExpenseRoutingModule { }