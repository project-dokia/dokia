import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { WalletRoutingModule } from './wallet-routing.module';
import { WalletComponent } from './wallet.component';
import { PageHeaderModule } from './../../shared';
import { LoadingModule } from 'ngx-loading';
import { MatTabsModule, MatCardModule, MatSelectModule } from '@angular/material';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  imports: [
    CommonModule,
    WalletRoutingModule,
    FormsModule,
    PageHeaderModule,
    MatTabsModule,
    LoadingModule,
    MatCardModule,
    MatSelectModule,
    NgbModule
  ],
  declarations: [WalletComponent]
})
export class WalletModule { }
