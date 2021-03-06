import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout.component';

const routes: Routes = [
    {
        path: '', component: LayoutComponent,
        children: [
            { path: 'document', loadChildren: './document/document.module#DocumentModule' },
            

            // { path: 'rule/list', loadChildren: './rule/list/list-rule.module#ListRuleModule' },
            // { path: 'rule/add', loadChildren: './rule/rule.module#RuleModule' },

            { path: 'lots', loadChildren: './lot/list/list-lot.module#ListLotModule' },
            { path: 'lot/:id', loadChildren: './lot/list-document/list-document-lot.module#ListLotDocumentModule' },
            
            { path: 'companys', loadChildren: './company/list/list-company.module#ListCompanyModule' },
            { path: 'company/add', loadChildren: './company/company.module#CompanyModule' },
            
            { path: 'company/:id/wallet/add', loadChildren: './wallet/wallet.module#WalletModule' },
            { path: 'company/:id/wallets', loadChildren: './wallet/list/list-wallet.module#ListWalletModule' },
            
            { path: 'company/:id/wallet/:id/user/add', loadChildren: './user/user.module#UserModule' },
            { path: 'company/:id/wallet/:id/users', loadChildren: './user/list/list-user.module#ListUserModule' },
            
            { path: 'company/:id/wallet/:id/user/:id/process/add', loadChildren: './process/process.module#ProcessModule' },
            { path: 'company/:id/wallet/:id/user/:id/process', loadChildren: './process/list/list-process.module#ListProcessModule' },  
            
            { path: 'company/:id/wallet/:id/user/:id/process/:id/expense/add', loadChildren: './expense/expense.module#ExpenseModule' },
            { path: 'company/:id/wallet/:id/user/:id/process/:id/expense', loadChildren: './expense/list/list-expense.module#ListExpenseModule' },  

            { path: 'company/:id/wallet/:id/user/:id/process/:id/expense/:id/document/add', loadChildren: './document/document.module#DocumentModule' },
            { path: 'company/:id/wallet/:id/user/:id/process/:id/expense/:id/document', loadChildren: './document/list/list-document.module#ListDocumentModule' },  
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class LayoutRoutingModule { }

