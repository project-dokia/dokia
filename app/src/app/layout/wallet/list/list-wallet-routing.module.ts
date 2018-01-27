import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListWalletComponent } from './list-wallet.component';

const routes: Routes = [
    { path: '', component: ListWalletComponent }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ListWalletRoutingModule { }