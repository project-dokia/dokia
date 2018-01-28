import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ListLotDocumentRoutingModule } from './list-document-lot-routing.module';
import { ListLotDocumentComponent } from './list-document-lot.component';
import { PageHeaderModule } from './../../../shared';
import { LoadingModule } from 'ngx-loading';
import { MatTabsModule, MatCardModule, MatSelectModule } from '@angular/material';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  imports: [
    CommonModule,
    ListLotDocumentRoutingModule,
    FormsModule,
    PageHeaderModule,
    MatTabsModule,
    LoadingModule,
    MatCardModule,
    MatSelectModule,
    NgbModule
  ],
  declarations: [ListLotDocumentComponent]
})
export class ListLotDocumentModule { }
