import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListDocumentComponent } from './list-document.component';

const routes: Routes = [
    { path: '', component: ListDocumentComponent }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ListDocumentRoutingModule { }