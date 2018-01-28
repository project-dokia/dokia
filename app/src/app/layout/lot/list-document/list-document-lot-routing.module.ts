import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListLotDocumentComponent } from './list-document-lot.component';

const routes: Routes = [
    { path: '', component: ListLotDocumentComponent }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ListLotDocumentRoutingModule { }