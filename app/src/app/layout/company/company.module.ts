import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { CompanyRoutingModule } from './company-routing.module';
import { CompanyComponent } from './company.component';
import { PageHeaderModule } from './../../shared';
import { LoadingModule } from 'ngx-loading';
import { MatTabsModule, MatCardModule, MatSelectModule } from '@angular/material';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  imports: [
    CommonModule,
    CompanyRoutingModule,
    FormsModule,
    PageHeaderModule,
    MatTabsModule,
    LoadingModule,
    MatCardModule,
    MatSelectModule,
    NgbModule,
  ],
  declarations: [CompanyComponent]
})
export class CompanyModule { }
