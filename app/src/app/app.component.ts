import { Component } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';
//import { OAuthService, JwksValidationHandler } from 'angular-oauth2-oidc';


@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.scss']
})
//teste authorize was
//https://w3id-test.sso.ibm.com/isam/oidc/endpoint/amapp-runtime-oidcidp/authorize?client_id=MDY3MGVlZDUtZDViOS00&redirect_uri=https://localhost:9443/supplier/api/auth
export class AppComponent {

    constructor(private translate: TranslateService//,
        //  private oauthService: OAuthService
    ) {
        translate.addLangs(['en', 'fr', 'ur', 'es', 'it', 'fa']);
        translate.setDefaultLang('en');
        const browserLang = translate.getBrowserLang();
        translate.use(browserLang.match(/en|fr|ur|es|it|fa/) ? browserLang : 'en');

        // this.configureWithNewConfigApi();
    }

    private configureWithNewConfigApi() {
        // this.oauthService.configure(authConfig);
        // this.oauthService.tokenValidationHandler = new JwksValidationHandler();
        // this.oauthService.loadDiscoveryDocumentAndTryLogin();
        
        // Load Discovery Document and then try to login the user
        // this.oauthService.loadDiscoveryDocument().then(() => {
        //     this.oauthService.tryLogin();
        //   });
        //ng g c home
    }

}