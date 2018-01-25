import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

//Translate:
//import { Http, HttpModule } from '@angular/http';
import { Http, HttpModule } from '@angular/http';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { TranslateModule, TranslateLoader } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';



// ng bootstrap
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

//import { OAuthModule } from 'angular-oauth2-oidc';


// AoT requires an exported function for factories
export function HttpLoaderFactory(http: HttpClient) { // return new TranslateHttpLoader(http);
    // for development
    // return new TranslateHttpLoader(http, '/start-angular/SB-Admin-BS4-Angular-4/master/dist/assets/i18n/', '.json');
    return new TranslateHttpLoader(http, '/assets/i18n/', '.json');
}
@NgModule({
    declarations: [
        AppComponent,
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        FormsModule,
        ReactiveFormsModule,
        HttpModule,
        HttpClientModule,
        AppRoutingModule,
        NgbModule.forRoot(),
        TranslateModule.forRoot({
            loader: {
                provide: TranslateLoader,
                useFactory: HttpLoaderFactory,
                deps: [Http, HttpClient]
            }
        }),
        //OAuthModule.forRoot()
    ],
    bootstrap: [AppComponent]
})

export class AppModule {

}
