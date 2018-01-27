import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout.component';

const routes: Routes = [
    {
        path: '', component: LayoutComponent,
        children: [
            { path: 'user', loadChildren: './user/user.module#UserModule' },
            { path: 'rule', loadChildren: './rule/rule.module#RuleModule' },
            { path: 'document', loadChildren: './document/document.module#DocumentModule' },
            { path: 'wallet', loadChildren: './wallet/wallet.module#WalletModule' },
            { path: 'cost', loadChildren: './cost/cost.module#CostModule' },
            { path: 'company', loadChildren: './company/company.module#CompanyModule' },
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class LayoutRoutingModule { }

