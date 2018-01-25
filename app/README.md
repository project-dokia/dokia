# SB Admin rewritten in Angular4 and Bootstrap 4

Simple Dashboard Admin App built using Angular 4 and Bootstrap 4

This project is a port of the famous Free Admin Bootstrap Theme [SB Admin v4.0](http://startbootstrap.com/template-overviews/sb-admin-2/) to Angular4 Theme.

Powered by [StartAngular](http://startangular.com/) & [StrapUI](http://strapui.com/)

## [Demo](http://rawgit.com/start-angular/SB-Admin-BS4-Angular-4/master/dist/)

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 1.0.0.

### Introduction
Provides fast, reliable and extensible starter for the development of Angular projects.

`sb-admin-bs4-angular4` provides the following features:
- Developed using boostrap-v4.0.0-alpha.6
- angular-v4.2.4
- angular/cli-v1.1.3
- Following the best practices.
- Ahead-of-Time compilation support.
- Official Angular i18n support.
- Production and development builds.
- Tree-Shaking production builds.

### How to start
**Note** that this seed project requires  **node >=v6.9.0 and npm >=3**.

In order to start the project use:
```bash
$ git clone https://github.com/start-angular/SB-Admin-BS4-Angular-4
$ cd SB-Admin-BS4-Angular-4
# install the project's dependencies
$ npm install
# watches your files and uses livereload by default run `npm start` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.
$ npm start
# prod build, will output the production application in `dist`
# the produced code can be deployed (rsynced) to a remote server
$ npm run build
```

### Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive/pipe/service/class/module`.

### Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

### Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
Before running the tests make sure you are serving the app via `ng serve`.
ng serve --open

### Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).


### Bootstrap dicas
npm install bootstrap@4.0.0-alpha.6 --save
npm install --save bootstrap@4.0.0-alpha.6 font-awesome

https://loiane.com/2017/08/how-to-add-bootstrap-to-an-angular-cli-project/
https://medium.com/@beeman/tutorial-add-bootstrap-to-angular-cli-apps-b0a652f2eb2
https://stackoverflow.com/questions/37649164/how-to-add-bootstrap-to-an-angular-cli-project

npm install ngx-bootstrap --save

### Icons
http://fontawesome.io/icons/

### Angular Material
https://material.angular.io/guide/getting-started

### Gerando Modules
ng g m layout/request --routing                         ng g c layout/request

### Gerando Services
ng generate service layout/request

### Tools
Redux DevTools

### Build Prod
ng build --base-href "" --prod

ng build --base-href "http://dokia.mybluemix.net/" --prod

### Toolchain
#!/bin/bash
hostname
pwd
ls
export PATH=/opt/IBM/node-v6.7.0/bin:$PATH
npm -v
node -v
npm install -g -f ls
cd dokia-front
pwd
ls
ng build --base-href "https://dokia.mybluemix.net/" --prod
# modo debug:
ng build --base-href "https://dokia.mybluemix.net/" --prod --verbose > aFile.txt
ng build --base-href "https://dokiaroom.mybluemix.net/" --prod
ng build --base-href "https://dokia2.mybluemix.net/" --prod
ng build --base-href "https://localhost:9443/dokia/" --dev
cd ..
mvn -B package


#### logs ####
testing-docker-d701510d-f4c7-41e1-8616-f3f1b0efcdea
/home/pipeline/6a08e67a-9d4d-4d66-b0ef-2abf07fbfa6c

# retirado do package.jason
   //"start": "ng serve --ec true --port 4201",

# Subir Desenvolvimento:
ng serve --ssl 1 --ssl-key key.pem --ssl-cert cert.pem --open

# ng-bootstrap
npm uninstall --save @ng-bootstrap/ng-bootstrap
npm install --save @ng-bootstrap/ng-bootstrap

# erro verificando:
# desinstalando codelyzer
npm uninstall --save-dev codelyzer
