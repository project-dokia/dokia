import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { CostRoutingModule } from './cost-routing.module';
import { CostComponent } from './cost.component';
import { PageHeaderModule } from './../../shared';
import { LoadingModule } from 'ngx-loading';
import { MatTabsModule, MatCardModule, MatSelectModule } from '@angular/material';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  imports: [
    CommonModule,
    CostRoutingModule,
    FormsModule,
    PageHeaderModule,
    MatTabsModule,
    LoadingModule,
    MatCardModule,
    MatSelectModule,
    NgbModule
  ],
  declarations: [CostComponent]
})
export class CostModule { }
