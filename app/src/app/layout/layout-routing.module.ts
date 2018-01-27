import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout.component';

const routes: Routes = [
    {
        path: '', component: LayoutComponent,
        children: [
            { path: 'document', loadChildren: './document/document.module#DocumentModule' },
            
            // // { path: 'user/list', loadChildren: './user/list/list-user.module#ListUserModule' },
            // { path: 'user/add', loadChildren: './user/user.module#UserModule' },

            // { path: 'rule/list', loadChildren: './rule/list/list-rule.module#ListRuleModule' },
            // { path: 'rule/add', loadChildren: './rule/rule.module#RuleModule' },

            // { path: 'wallet/list', loadChildren: './wallet/list/list-wallet.module#ListWalletModule' },
            // { path: 'wallet/add', loadChildren: './wallet/wallet.module#WalletModule' },

            // { path: 'cost/list', loadChildren: './cost/list/list-cost.module#ListCostModule' },
            // { path: 'cost/add', loadChildren: './cost/cost.module#CostModule' },

            { path: 'companys', loadChildren: './company/list/list-company.module#ListCompanyModule' },
            { path: 'company/add', loadChildren: './company/company.module#CompanyModule' },
            { path: 'company/:id/wallet/add', loadChildren: './wallet/wallet.module#WalletModule' },
            { path: 'company/:id/wallets', loadChildren: './wallet/list/list-wallet.module#ListWalletModule' },
            
            { path: 'company/:id/wallet/:id/user/add', loadChildren: './user/user.module#UserModule' },
            { path: 'company/:id/wallet/:id/users', loadChildren: './user/list/list-user.module#ListUserModule' },
            
                    
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class LayoutRoutingModule { }

