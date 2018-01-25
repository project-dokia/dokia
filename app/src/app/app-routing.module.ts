import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


//import { OAuthModule } from 'angular-oauth2-oidc';
//import { SearchService, AuthGuard } from './shared';


const routes: Routes = [
    {
        path: '',
        loadChildren: './layout/layout.module#LayoutModule',
    },
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
