webpackJsonp([9],{XVMD:function(n,t,e){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=e("LMZF"),l=function(){},i=e("UHIZ"),r=e("Un6q"),c=e("q6td"),a=e("cpxJ"),u=function(){function n(n,t){var e=this;this.translate=n,this.router=t,this.pushRightClass="push-right",this.router.events.subscribe(function(n){n instanceof i.d&&window.innerWidth<=992&&e.isToggled()&&e.toggleSidebar()})}return n.prototype.ngOnInit=function(){this.user=new a.a},n.prototype.isToggled=function(){return document.querySelector("body").classList.contains(this.pushRightClass)},n.prototype.toggleSidebar=function(){document.querySelector("body").classList.toggle(this.pushRightClass)},n.prototype.rltAndLtr=function(){document.querySelector("body").classList.toggle("rtl")},n.prototype.onLoggedout=function(){localStorage.removeItem("isLoggedin")},n.prototype.changeLang=function(n){this.translate.use(n)},n}(),s=o._6({encapsulation:0,styles:[[".topnav[_ngcontent-%COMP%]{border-radius:0;background-color:#4574ca;padding:6px;z-index:2}.topnav[_ngcontent-%COMP%]   .text-center[_ngcontent-%COMP%]{text-align:center;padding-left:0;cursor:pointer}.topnav[_ngcontent-%COMP%]   .top-right-nav[_ngcontent-%COMP%]   .buy-now[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]{color:#999}.topnav[_ngcontent-%COMP%]   .top-right-nav[_ngcontent-%COMP%]   .dropdown-menu[_ngcontent-%COMP%]{top:40px;right:-5px;left:auto}.topnav[_ngcontent-%COMP%]   .top-right-nav[_ngcontent-%COMP%]   .dropdown-menu[_ngcontent-%COMP%]   .message-preview[_ngcontent-%COMP%]   .media[_ngcontent-%COMP%]   .media-body[_ngcontent-%COMP%]   .media-heading[_ngcontent-%COMP%]{font-size:14px;font-weight:700;margin-bottom:0}.topnav[_ngcontent-%COMP%]   .top-right-nav[_ngcontent-%COMP%]   .dropdown-menu[_ngcontent-%COMP%]   .message-preview[_ngcontent-%COMP%]   .media[_ngcontent-%COMP%]   .media-body[_ngcontent-%COMP%]   p[_ngcontent-%COMP%]{margin:0}.topnav[_ngcontent-%COMP%]   .top-right-nav[_ngcontent-%COMP%]   .dropdown-menu[_ngcontent-%COMP%]   .message-preview[_ngcontent-%COMP%]   .media[_ngcontent-%COMP%]   .media-body[_ngcontent-%COMP%]   p.last[_ngcontent-%COMP%]{font-size:13px;margin-bottom:0}.topnav[_ngcontent-%COMP%]   .top-right-nav[_ngcontent-%COMP%]   .dropdown-menu[_ngcontent-%COMP%]   hr[_ngcontent-%COMP%]{margin-top:1px;margin-bottom:4px}.messages[_ngcontent-%COMP%]{width:300px}.messages[_ngcontent-%COMP%]   .media[_ngcontent-%COMP%]{border-bottom:1px solid #ddd;padding:5px 10px}.messages[_ngcontent-%COMP%]   .media[_ngcontent-%COMP%]:last-child{border-bottom:none}.messages[_ngcontent-%COMP%]   .media-body[_ngcontent-%COMP%]   h5[_ngcontent-%COMP%]{font-size:13px;font-weight:600}.messages[_ngcontent-%COMP%]   .media-body[_ngcontent-%COMP%]   .small[_ngcontent-%COMP%]{margin:0}.messages[_ngcontent-%COMP%]   .media-body[_ngcontent-%COMP%]   .last[_ngcontent-%COMP%]{font-size:12px;margin:0}.header[_ngcontent-%COMP%]   .navbar[_ngcontent-%COMP%]{background:#4574ca!important}"]],data:{}});function d(n){return o._29(0,[(n()(),o._8(0,0,null,null,17,"div",[["class","pos-f-t fixed-top header"]],null,null,null,null,null)),(n()(),o._28(-1,null,["\n    "])),(n()(),o._8(2,0,null,null,14,"nav",[["class","navbar navbar-inverse bg-inverse navbar-toggleable-md"]],null,null,null,null,null)),(n()(),o._28(-1,null,["\n        "])),(n()(),o._8(4,0,null,null,3,"button",[["class","navbar-toggler navbar-toggler-right"]],null,[[null,"click"]],function(n,t,e){var o=!0;return"click"===t&&(o=!1!==n.component.toggleSidebar()&&o),o},null,null)),(n()(),o._28(-1,null,["\n            "])),(n()(),o._8(6,0,null,null,0,"span",[["class","navbar-toggler-icon"]],null,null,null,null,null)),(n()(),o._28(-1,null,["\n        "])),(n()(),o._28(-1,null,["\n        "])),(n()(),o._8(9,0,null,null,6,"a",[["class","navbar-brand"],["href","javascript:void(0)"],["routerLink","/companys"]],[[1,"target",0],[8,"href",4]],[[null,"click"]],function(n,t,e){var l=!0;return"click"===t&&(l=!1!==o._20(n,10).onClick(e.button,e.ctrlKey,e.metaKey,e.shiftKey)&&l),l},null,null)),o._7(10,671744,[[2,4]],0,i.o,[i.l,i.a,r.g],{routerLink:[0,"routerLink"]},null),o._7(11,1720320,null,2,i.n,[i.l,o.l,o.G,o.h],{routerLinkActive:[0,"routerLinkActive"]},null),o._26(603979776,1,{links:1}),o._26(603979776,2,{linksWithHrefs:1}),o._22(14,1),(n()(),o._28(-1,null,["Dokia"])),(n()(),o._28(-1,null,["\n    "])),(n()(),o._28(-1,null,["\n"])),(n()(),o._28(-1,null,["\n"]))],function(n,t){n(t,10,0,"/companys"),n(t,11,0,n(t,14,0,"router-link-active"))},function(n,t){n(t,9,0,o._20(t,10).target,o._20(t,10).href)})}var g=function(){function n(){this.isActive=!1,this.showMenu=""}return n.prototype.eventCalled=function(){this.isActive=!this.isActive},n.prototype.addExpandClass=function(n){this.showMenu=n===this.showMenu?"0":n},n}(),p=o._6({encapsulation:0,styles:[[".sidebar[_ngcontent-%COMP%]{position:fixed;z-index:1000;top:55px;left:235px;width:235px;margin-left:-235px;border:none;border-radius:0;overflow-y:auto;background-color:#4574ca;bottom:0;overflow-x:hidden;padding-bottom:40px;-webkit-transition:all .2s ease-in-out;transition:all .2s ease-in-out}.sidebar[_ngcontent-%COMP%]   .list-group[_ngcontent-%COMP%]   a.list-group-item[_ngcontent-%COMP%]{background:#4574ca;border:0;border-radius:0;color:#999;text-decoration:none}.sidebar[_ngcontent-%COMP%]   .list-group[_ngcontent-%COMP%]   a.list-group-item[_ngcontent-%COMP%]   .fa[_ngcontent-%COMP%]{margin-right:10px}.sidebar[_ngcontent-%COMP%]   .list-group[_ngcontent-%COMP%]   a.router-link-active[_ngcontent-%COMP%], .sidebar[_ngcontent-%COMP%]   .list-group[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]:hover{background:#3667bf;color:#fff}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   [_ngcontent-%COMP%]:focus{border-radius:none;border:none}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-title[_ngcontent-%COMP%]{font-size:1rem;height:50px;margin-bottom:0}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-title[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]{color:#999;text-decoration:none;font-weight:400;background:#4574ca}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-title[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]   span[_ngcontent-%COMP%]{position:relative;display:block;padding:.75rem 1.5rem;padding-top:1rem}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-title[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]:focus, .sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-title[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]:hover{color:#fff;outline:none;outline-offset:-2px}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-title[_ngcontent-%COMP%]:hover{background:#3667bf}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-collapse[_ngcontent-%COMP%]{border-radious:0;border:none}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-collapse[_ngcontent-%COMP%]   .panel-body[_ngcontent-%COMP%]   .list-group-item[_ngcontent-%COMP%]{border-radius:0;background-color:#4574ca;border:0 solid transparent}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-collapse[_ngcontent-%COMP%]   .panel-body[_ngcontent-%COMP%]   .list-group-item[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]{color:#999}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-collapse[_ngcontent-%COMP%]   .panel-body[_ngcontent-%COMP%]   .list-group-item[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]:hover{color:#fff}.sidebar[_ngcontent-%COMP%]   .sidebar-dropdown[_ngcontent-%COMP%]   .panel-collapse[_ngcontent-%COMP%]   .panel-body[_ngcontent-%COMP%]   .list-group-item[_ngcontent-%COMP%]:hover{background:#3667bf}.nested-menu[_ngcontent-%COMP%]   .list-group-item[_ngcontent-%COMP%]{cursor:pointer}.nested-menu[_ngcontent-%COMP%]   .nested[_ngcontent-%COMP%]{list-style-type:none}.nested-menu[_ngcontent-%COMP%]   ul.submenu[_ngcontent-%COMP%]{display:none;height:0}.nested-menu[_ngcontent-%COMP%]   .expand[_ngcontent-%COMP%]   ul.submenu[_ngcontent-%COMP%]{display:block;list-style-type:none;height:auto}.nested-menu[_ngcontent-%COMP%]   .expand[_ngcontent-%COMP%]   ul.submenu[_ngcontent-%COMP%]   li[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]{color:#fff;padding:10px;display:block}@media screen and (max-width:992px){.sidebar[_ngcontent-%COMP%]{top:54px;left:0}}"]],data:{}});function _(n){return o._29(0,[(n()(),o._8(0,0,null,null,29,"nav",[["class","sidebar"]],null,null,null,null,null)),o._7(1,278528,null,0,r.h,[o.t,o.u,o.l,o.G],{klass:[0,"klass"],ngClass:[1,"ngClass"]},null),o._23(2,{sidebarPushRight:0}),(n()(),o._28(-1,null,["\n\t"])),(n()(),o._8(4,0,null,null,11,"ul",[["class","list-group"]],null,null,null,null,null)),(n()(),o._28(-1,null,["\n\t\t"])),(n()(),o._8(6,0,null,null,8,"a",[["class","list-group-item"],["routerLink","/companys"]],[[1,"target",0],[8,"href",4]],[[null,"click"]],function(n,t,e){var l=!0;return"click"===t&&(l=!1!==o._20(n,7).onClick(e.button,e.ctrlKey,e.metaKey,e.shiftKey)&&l),l},null,null)),o._7(7,671744,[[2,4]],0,i.o,[i.l,i.a,r.g],{routerLink:[0,"routerLink"]},null),o._7(8,1720320,null,2,i.n,[i.l,o.l,o.G,o.h],{routerLinkActive:[0,"routerLinkActive"]},null),o._26(603979776,1,{links:1}),o._26(603979776,2,{linksWithHrefs:1}),o._22(11,1),(n()(),o._28(-1,null,[" "])),(n()(),o._8(13,0,null,null,0,"i",[["class","fa fa-fw fa-info-circle"]],null,null,null,null,null)),(n()(),o._28(-1,null,["\xa0Flow de Documentos\n\t\t"])),(n()(),o._28(-1,null,["\n\t"])),(n()(),o._28(-1,null,[" \n\n\t"])),(n()(),o._8(17,0,null,null,11,"ul",[["class","list-group"]],null,null,null,null,null)),(n()(),o._28(-1,null,["\n\t\t"])),(n()(),o._8(19,0,null,null,8,"a",[["class","list-group-item"],["routerLink","/lots"]],[[1,"target",0],[8,"href",4]],[[null,"click"]],function(n,t,e){var l=!0;return"click"===t&&(l=!1!==o._20(n,20).onClick(e.button,e.ctrlKey,e.metaKey,e.shiftKey)&&l),l},null,null)),o._7(20,671744,[[4,4]],0,i.o,[i.l,i.a,r.g],{routerLink:[0,"routerLink"]},null),o._7(21,1720320,null,2,i.n,[i.l,o.l,o.G,o.h],{routerLinkActive:[0,"routerLinkActive"]},null),o._26(603979776,3,{links:1}),o._26(603979776,4,{linksWithHrefs:1}),o._22(24,1),(n()(),o._28(-1,null,[" "])),(n()(),o._8(26,0,null,null,0,"i",[["class","fa fa-fw fa-info-circle"]],null,null,null,null,null)),(n()(),o._28(-1,null,["\xa0Lote\n\t\t"])),(n()(),o._28(-1,null,["\n\t"])),(n()(),o._28(-1,null,[" \n"]))],function(n,t){n(t,1,0,"sidebar",n(t,2,0,t.component.isActive)),n(t,7,0,"/companys"),n(t,8,0,n(t,11,0,"router-link-active")),n(t,20,0,"/lots"),n(t,21,0,n(t,24,0,"router-link-active"))},function(n,t){n(t,6,0,o._20(t,7).target,o._20(t,7).href),n(t,19,0,o._20(t,20).target,o._20(t,20).href)})}var C=function(){function n(n){this.router=n}return n.prototype.ngOnInit=function(){"/"===this.router.url&&this.router.navigate(["/companys"])},n}(),M=o._6({encapsulation:0,styles:[['.main-container[_ngcontent-%COMP%]{margin-top:60px;margin-left:235px;padding:15px;-ms-overflow-x:hidden;overflow-x:hidden;overflow-y:scroll;position:relative;overflow:hidden}@media screen and (max-width:992px){.main-container[_ngcontent-%COMP%]{margin-left:0!important}}.gap-top5[_ngcontent-%COMP%]{margin-top:5px}.timeline[_ngcontent-%COMP%]{background-color:#fff;padding:30px}.timeline-section1[_ngcontent-%COMP%]   .timeline-icon-section[_ngcontent-%COMP%], .timeline-section2[_ngcontent-%COMP%]   .timeline-content-top[_ngcontent-%COMP%]{position:relative;border-bottom:20px solid #dc3545}.timeline-section2[_ngcontent-%COMP%]   .timeline-content-top[_ngcontent-%COMP%]{border-bottom:20px solid #17a2b8}.timeline-section1[_ngcontent-%COMP%]   .timeline-icon-section[_ngcontent-%COMP%]:after{content:" ";position:absolute;top:190px;right:0;border:10px solid #fff;border-left-color:#dc3545}.timeline-section1[_ngcontent-%COMP%]   .timeline-icon-section[_ngcontent-%COMP%]:before{content:" ";position:absolute;top:190px;left:0;border:10px solid transparent;border-left-color:#fff}.timeline-section2[_ngcontent-%COMP%]   .timeline-icon-section[_ngcontent-%COMP%]:after{content:" ";position:absolute;top:-20px;right:0;border:10px solid #fff;border-left-color:#17a2b8}.timeline-section2[_ngcontent-%COMP%]   .timeline-icon-section[_ngcontent-%COMP%]:before{content:" ";position:absolute;top:-20px;left:0;border:10px solid transparent;border-left-color:#fff}.timeline-icon-section[_ngcontent-%COMP%]   img[_ngcontent-%COMP%]{border:1px solid #dc3545;width:100px;height:100px}.borders[_ngcontent-%COMP%]{border-right:1px solid #c2c2c2;height:50px;width:1px;margin:20px auto}.timeline-section2[_ngcontent-%COMP%]   .timeline-icon-section[_ngcontent-%COMP%]   img[_ngcontent-%COMP%]{border:1px solid #17a2b8}.timeline-content-bottom[_ngcontent-%COMP%]{margin-top:70px}.timeline-content-bottom[_ngcontent-%COMP%]   h1[_ngcontent-%COMP%], .timeline-content-top[_ngcontent-%COMP%]   h1[_ngcontent-%COMP%]{font-weight:700}']],data:{}});function m(n){return o._29(0,[(n()(),o._8(0,0,null,null,1,"app-header",[],null,null,null,d,s)),o._7(1,114688,null,0,u,[c.i,i.l],null,null),(n()(),o._28(-1,null,["\n"])),(n()(),o._8(3,0,null,null,1,"app-sidebar",[],null,null,null,_,p)),o._7(4,49152,null,0,g,[],null,null),(n()(),o._28(-1,null,["\n"])),(n()(),o._8(6,0,null,null,4,"section",[["class","main-container"]],null,null,null,null,null)),(n()(),o._28(-1,null,["\n    "])),(n()(),o._8(8,16777216,null,null,1,"router-outlet",[],null,null,null,null,null)),o._7(9,212992,null,0,i.q,[i.b,o.R,o.j,[8,null],o.h],null,null),(n()(),o._28(-1,null,["\n"])),(n()(),o._28(-1,null,["\n"]))],function(n,t){n(t,1,0),n(t,9,0)},null)}var P=o._4("app-layout",C,function(n){return o._29(0,[(n()(),o._8(0,0,null,null,1,"app-layout",[],null,null,null,m,M)),o._7(1,114688,null,0,C,[i.l],null,null)],function(n,t){n(t,1,0)},null)},{},{},[]),O=e("Qyse"),b=e("g5gQ"),h=function(){};e.d(t,"LayoutModuleNgFactory",function(){return f});var f=o._5(l,[],function(n){return o._16([o._17(512,o.j,o._1,[[8,[P]],[3,o.j],o.y]),o._17(4608,r.l,r.k,[o.v,[2,r.q]]),o._17(4608,O.a,O.a,[]),o._17(512,r.b,r.b,[]),o._17(512,b.a,b.a,[]),o._17(512,i.p,i.p,[[2,i.u],[2,i.l]]),o._17(512,h,h,[]),o._17(512,c.g,c.g,[]),o._17(512,l,l,[]),o._17(1024,i.j,function(){return[[{path:"",component:C,children:[{path:"document",loadChildren:"./document/document.module#DocumentModule"},{path:"lots",loadChildren:"./lot/list/list-lot.module#ListLotModule"},{path:"lot/:id",loadChildren:"./lot/list-document/list-document-lot.module#ListLotDocumentModule"},{path:"companys",loadChildren:"./company/list/list-company.module#ListCompanyModule"},{path:"company/add",loadChildren:"./company/company.module#CompanyModule"},{path:"company/:id/wallet/add",loadChildren:"./wallet/wallet.module#WalletModule"},{path:"company/:id/wallets",loadChildren:"./wallet/list/list-wallet.module#ListWalletModule"},{path:"company/:id/wallet/:id/user/add",loadChildren:"./user/user.module#UserModule"},{path:"company/:id/wallet/:id/users",loadChildren:"./user/list/list-user.module#ListUserModule"},{path:"company/:id/wallet/:id/user/:id/process/add",loadChildren:"./process/process.module#ProcessModule"},{path:"company/:id/wallet/:id/user/:id/process",loadChildren:"./process/list/list-process.module#ListProcessModule"},{path:"company/:id/wallet/:id/user/:id/process/:id/expense/add",loadChildren:"./expense/expense.module#ExpenseModule"},{path:"company/:id/wallet/:id/user/:id/process/:id/expense",loadChildren:"./expense/list/list-expense.module#ListExpenseModule"},{path:"company/:id/wallet/:id/user/:id/process/:id/expense/:id/document/add",loadChildren:"./document/document.module#DocumentModule"},{path:"company/:id/wallet/:id/user/:id/process/:id/expense/:id/document",loadChildren:"./document/list/list-document.module#ListDocumentModule"}]}]]},[])])})}});