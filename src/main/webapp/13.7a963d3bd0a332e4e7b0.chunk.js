webpackJsonp([13],{zdun:function(l,n,u){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var e=u("LMZF"),t=function(){},o=u("0nO6"),s=u("dRgx"),_=u("TMwh"),a=u("cmLb"),i=u("r0qr"),c=u("UFnG"),r=u("cP51"),p=u("emCa"),d=u("wuLK"),h=u("0WLp"),f=u("UHIZ"),g=u("9iV4"),m=u("TBHc"),y=u("cpxJ"),b=u("0x0H"),v=u("HsUc"),S=u("CJXk"),C=u("Un6q"),w=function(){function l(l,n,u,e,t,o,s,_,a,i,c){this._location=l,this.httpClient=n,this.router=u,this.documentService=e,this.lotService=t,this.processService=o,this.expenseService=s,this.walletService=_,this.userService=a,this.companyService=i,this.modalService=c,this.fileToUpload=null}return l.prototype.ngOnInit=function(){this.document=new function(){},this.docSend=new function(){},this.idWallet=this.router.url.split("wallet/").pop().split("/user").shift(),this.idCompany=this.router.url.split("company/").pop().split("/wallet").shift(),this.idUser=this.router.url.split("user/").pop().split("/process").shift(),this.idProcess=this.router.url.split("process/").pop().split("/expense").shift(),this.idExpense=this.router.url.split("expense/").pop().split("/document").shift(),this.process=new m.a,this.company=new b.a,this.user=new y.a,this.expense=new v.a,this.wallet=new S.a,this.docSend.cpf="45084552802",this.docSend.lot="123",this.docSend.requestedValue="R$10,50",this.docSend.approveRule="false",this.docSend.approvePerson="false",this.getInfos()},l.prototype.handleFileInput=function(l){this.fileToUpload=l.item(0),console.log(this.fileToUpload)},l.prototype.uploadFileToActivity=function(){this.addDocument()},l.prototype.postFile=function(l){var n=this;this.docSend.process=this.process,this.docSend.company=this.company,this.docSend.user=this.user,this.docSend.expense=this.expense,this.docSend.wallet=this.wallet,this.docSend.idExpense=this.idExpense;var u=new FormData;return u.append("fileKey",l,l.name),u.set("docSend",JSON.stringify(this.docSend)),this.httpClient.post("https://dokia-ocr.herokuapp.com/upload_doc",u).map(function(){return!0}).catch(function(l){return n.handleError(l)})},l.prototype.backLocation=function(){this._location.back()},l.prototype.handleError=function(l){return console.error("An error occurred",l),Promise.reject(l.message||l)},l.prototype.open=function(l){this.modalService.open(l,{backdrop:"static",size:"lg"})},l.prototype.openModal=function(l,n){},l.prototype.getDismissReason=function(l){return l===h.a.ESC?"by pressing ESC":l===h.a.BACKDROP_CLICK?"by clicking on a backdrop":"with: "+l},l.prototype.getInfos=function(){var l=this;this.processService.getProcesssByIDObservable(this.idProcess).subscribe(function(n){l.process=n},function(l){console.log(l)}),this.companyService.getCompanyByIDObservable(this.idCompany).subscribe(function(n){l.company=n},function(l){console.log(l)}),this.userService.getUserByIDObservable(this.idUser).subscribe(function(n){l.user=n},function(l){console.log(l)}),this.expenseService.getExpensesByIDObservable(this.idExpense).subscribe(function(n){l.expense=n},function(l){console.log(l)}),this.walletService.getWalletByIDObservable(this.idWallet).subscribe(function(n){l.wallet=n},function(l){console.log(l)})},l.prototype.addDocument=function(){var l=this;this.documentService.addDocumentWithObservable(this.docSend).subscribe(function(n){l.postFile(l.fileToUpload).subscribe(function(n){l.docSend._id=n.toString(),alert("Adicionado!"),l.process=new m.a,l.backLocation()},function(l){console.log(l)})},function(l){console.log(l)}),this.lot=new function(){},this.lot.code=this.docSend.lot,this.lotService.addLotWithObservable(this.lot).subscribe(function(l){},function(l){console.log(l)})},l}(),x=u("dN2u"),j=e._6({encapsulation:0,styles:[[".background-button[_ngcontent-%COMP%]{background:#29665e;color:#fff;size:16px}.gap-top10[_ngcontent-%COMP%]{margin-top:10px}.gap-bottom10[_ngcontent-%COMP%]{margin-bottom:10px}"]],data:{animation:[{type:7,name:"routerTransition",definitions:[{type:0,name:"void",styles:{type:6,styles:{},offset:null},options:void 0},{type:0,name:"*",styles:{type:6,styles:{},offset:null},options:void 0},{type:1,expr:":enter",animation:[{type:6,styles:{transform:"translateY(100%)"},offset:null},{type:4,styles:{type:6,styles:{transform:"translateY(0%)"},offset:null},timings:"0.5s ease-in-out"}],options:null},{type:1,expr:":leave",animation:[{type:6,styles:{transform:"translateY(0%)"},offset:null},{type:4,styles:{type:6,styles:{transform:"translateY(-100%)"},offset:null},timings:"0.5s ease-in-out"}],options:null}],options:{}},{type:7,name:"elementTransition",definitions:[{type:0,name:"void",styles:{type:6,styles:{},offset:null},options:void 0},{type:0,name:"*",styles:{type:6,styles:{},offset:null},options:void 0},{type:1,expr:":enter",animation:[{type:6,styles:{transform:"translateX(-100%)",opacity:0},offset:null},{type:4,styles:{type:6,styles:{transform:"translateX(0%)",opacity:1},offset:null},timings:"0.5s ease-in-out"}],options:null},{type:1,expr:":leave",animation:[{type:6,styles:{transform:"translateX(0%)",opacity:1},offset:null},{type:4,styles:{type:6,styles:{transform:"translateX(-100%)",opacity:0},offset:null},timings:"0.5s ease-in-out"}],options:null}],options:{}}]}});function D(l){return e._29(0,[(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(1,0,null,null,10,"div",[["class","modal-header"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(3,0,null,null,1,"h4",[["class","modal-title"]],null,null,null,null,null)),(l()(),e._28(-1,null,["Resultado da OCR"])),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(6,0,null,null,4,"button",[["aria-label","Close"],["class","close"],["type","button"]],null,[[null,"click"]],function(l,n,u){var e=!0;return"click"===n&&(e=!1!==l.context.dismiss("Cross click")&&e),e},null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(8,0,null,null,1,"span",[["aria-hidden","true"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\xd7"])),(l()(),e._28(-1,null,["\n            "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(13,0,null,null,11,"div",[["class","modal-body"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(15,0,null,null,8,"section",[["class","form-group row justify-content-between"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n                "])),(l()(),e._8(17,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n                    "])),(l()(),e._8(19,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(20,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(21,null,["",""])),(l()(),e._28(-1,null,["\n                "])),(l()(),e._28(-1,null,["\n            "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "]))],null,function(l,n){l(n,21,0,n.component.result)})}function I(l){return e._29(0,[(l()(),e._8(0,0,null,null,333,"div",[],null,null,null,null,null)),(l()(),e._28(-1,null,["    \n    "])),(l()(),e._8(2,0,null,null,10,"section",[],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(4,0,null,null,7,"div",[["class","row"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(6,0,null,null,4,"div",[["class","col-12 text-left"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n                "])),(l()(),e._8(8,0,null,null,1,"h3",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Document"])),(l()(),e._28(-1,null,["\n            "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,[" \n    "])),(l()(),e._28(-1,null,["\n                    \n    "])),(l()(),e._8(14,0,null,null,0,"hr",[],null,null,null,null,null)),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(16,0,null,null,27,"section",[["class","form-group row justify-content-between"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(18,0,null,null,5,"div",[["class","col-2 gap-top10 "]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(20,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(21,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["ID Company"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(25,0,null,null,4,"div",[["class","col-4 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(27,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(28,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(31,0,null,null,5,"div",[["class","col-2 gap-top10 "]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(33,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(34,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["ID Wallet"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(38,0,null,null,4,"div",[["class","col-4 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(40,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(41,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(45,0,null,null,27,"section",[["class","form-group row justify-content-between"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(47,0,null,null,5,"div",[["class","col-2 gap-top10 "]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(49,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(50,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["ID User"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(54,0,null,null,4,"div",[["class","col-4 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(56,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(57,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(60,0,null,null,5,"div",[["class","col-2 gap-top10 "]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(62,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(63,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["ID Process"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(67,0,null,null,4,"div",[["class","col-4 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(69,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(70,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(74,0,null,null,27,"section",[["class","form-group row justify-content-start"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(76,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(78,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(79,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Process Number"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(83,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(85,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(86,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n\n        "])),(l()(),e._8(89,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(91,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(92,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["User CPF"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(96,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(98,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(99,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(103,0,null,null,27,"section",[["class","form-group row justify-content-start"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(105,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(107,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(108,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Company CNPJ"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(112,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(114,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(115,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(118,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(120,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(121,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Company Name Reason"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(125,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(127,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(128,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(132,0,null,null,27,"section",[["class","form-group row justify-content-start"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(134,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(136,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(137,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["User name"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(141,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(143,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(144,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(147,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(149,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(150,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["User ID SIR"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(154,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(156,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(157,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(161,0,null,null,27,"section",[["class","form-group row justify-content-start"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(163,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(165,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(166,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Code expense"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(170,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(172,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(173,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(176,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(178,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(179,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Type Expense"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(183,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(185,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(186,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(190,0,null,null,27,"section",[["class","form-group row justify-content-start"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(192,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(194,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(195,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Description Expense"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(199,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(201,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(202,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(205,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(207,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(208,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Release Day"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(212,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(214,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(215,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(219,0,null,null,27,"section",[["class","form-group row justify-content-start"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(221,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(223,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(224,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Description"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(228,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(230,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(231,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(234,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(236,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(237,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Code"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(241,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(243,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(244,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(248,0,null,null,14,"section",[["class","form-group row justify-content-start"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(250,0,null,null,5,"div",[["class","col-2 gap-top10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(252,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(253,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Process Number"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(257,0,null,null,4,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(259,0,null,null,1,"h5",[],null,null,null,null,null)),(l()(),e._28(260,null,["",""])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n    \n    "])),(l()(),e._8(264,0,null,null,0,"hr",[],null,null,null,null,null)),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(266,0,null,null,6,"div",[["class","form-group"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(268,0,null,null,1,"label",[["for","file"]],null,null,null,null,null)),(l()(),e._28(-1,null,["Choose File"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(271,0,null,null,0,"input",[["id","file"],["type","file"]],null,[[null,"change"]],function(l,n,u){var e=!0;return"change"===n&&(e=!1!==l.component.handleFileInput(u.target.files)&&e),e},null,null)),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(274,0,null,null,0,"hr",[],null,null,null,null,null)),(l()(),e._28(-1,null,["\n\n    "])),(l()(),e._8(276,0,null,null,35,"section",[["class","form-group row justify-content-between"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(278,0,null,null,5,"div",[["class","col-2 "]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(280,0,null,null,2,"h5",[["class","gap-top10 "]],null,null,null,null,null)),(l()(),e._8(281,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Lot"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(285,0,null,null,8,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(287,0,null,null,5,"input",[["class","form-control"],["id","docSend.lot"],["name","docSend.lot"],["type","text"]],[[2,"ng-untouched",null],[2,"ng-touched",null],[2,"ng-pristine",null],[2,"ng-dirty",null],[2,"ng-valid",null],[2,"ng-invalid",null],[2,"ng-pending",null]],[[null,"ngModelChange"],[null,"input"],[null,"blur"],[null,"compositionstart"],[null,"compositionend"]],function(l,n,u){var t=!0,o=l.component;return"input"===n&&(t=!1!==e._20(l,288)._handleInput(u.target.value)&&t),"blur"===n&&(t=!1!==e._20(l,288).onTouched()&&t),"compositionstart"===n&&(t=!1!==e._20(l,288)._compositionStart()&&t),"compositionend"===n&&(t=!1!==e._20(l,288)._compositionEnd(u.target.value)&&t),"ngModelChange"===n&&(t=!1!==(o.docSend.lot=u)&&t),t},null,null)),e._7(288,16384,null,0,o.b,[e.G,e.l,[2,o.a]],null,null),e._24(1024,null,o.f,function(l){return[l]},[o.b]),e._7(290,671744,null,0,o.i,[[8,null],[8,null],[8,null],[2,o.f]],{name:[0,"name"],model:[1,"model"]},{update:"ngModelChange"}),e._24(2048,null,o.g,null,[o.i]),e._7(292,16384,null,0,o.h,[o.g],null,null),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(295,0,null,null,5,"div",[["class","col-2 gap-top10 "]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(297,0,null,null,2,"h5",[],null,null,null,null,null)),(l()(),e._8(298,0,null,null,1,"b",[],null,null,null,null,null)),(l()(),e._28(-1,null,["Request Value"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(302,0,null,null,8,"div",[["class","col-4"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(304,0,null,null,5,"input",[["class","form-control"],["id","docSend.requestedValue"],["name","docSend.requestedValue"],["type","text"]],[[2,"ng-untouched",null],[2,"ng-touched",null],[2,"ng-pristine",null],[2,"ng-dirty",null],[2,"ng-valid",null],[2,"ng-invalid",null],[2,"ng-pending",null]],[[null,"ngModelChange"],[null,"input"],[null,"blur"],[null,"compositionstart"],[null,"compositionend"]],function(l,n,u){var t=!0,o=l.component;return"input"===n&&(t=!1!==e._20(l,305)._handleInput(u.target.value)&&t),"blur"===n&&(t=!1!==e._20(l,305).onTouched()&&t),"compositionstart"===n&&(t=!1!==e._20(l,305)._compositionStart()&&t),"compositionend"===n&&(t=!1!==e._20(l,305)._compositionEnd(u.target.value)&&t),"ngModelChange"===n&&(t=!1!==(o.docSend.requestedValue=u)&&t),t},null,null)),e._7(305,16384,null,0,o.b,[e.G,e.l,[2,o.a]],null,null),e._24(1024,null,o.f,function(l){return[l]},[o.b]),e._7(307,671744,null,0,o.i,[[8,null],[8,null],[8,null],[2,o.f]],{name:[0,"name"],model:[1,"model"]},{update:"ngModelChange"}),e._24(2048,null,o.g,null,[o.i]),e._7(309,16384,null,0,o.h,[o.g],null,null),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["  \n\n    "])),(l()(),e._8(313,0,null,null,0,"hr",[],null,null,null,null,null)),(l()(),e._28(-1,null,["\n    \n    "])),(l()(),e._8(315,0,null,null,7,"section",[["class","form-group row justify-content-between gap-top10 gap-bottom10"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(317,0,null,null,4,"div",[["class","col-4 offset-4 gap-top10 "]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(319,0,null,null,1,"button",[["class","btn background-button form-control"],["type","button"]],null,[[null,"click"]],function(l,n,u){var e=!0;return"click"===n&&(e=!1!==l.component.uploadFileToActivity()&&e),e},null,null)),(l()(),e._28(-1,null,["UPLOAD AND SAVE"])),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,[" \n\n    "])),(l()(),e._8(324,0,null,null,6,"section",[["class","form-group row justify-content-between"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._8(326,0,null,null,3,"div",[["class","col-12 text-right"]],null,null,null,null,null)),(l()(),e._28(-1,null,["\n            "])),(l()(),e._8(328,0,null,null,0,"i",[["aria-hidden","true"],["class","fa fa-plus-square fa-2x click"]],null,[[null,"click"]],function(l,n,u){var t=!0;return"click"===n&&(t=!1!==l.component.open(e._20(l,332))&&t),t},null,null)),(l()(),e._28(-1,null,["\n        "])),(l()(),e._28(-1,null,["\n    "])),(l()(),e._28(-1,null,["  \n\n    "])),(l()(),e._3(0,[["content",2]],null,0,null,D)),(l()(),e._28(-1,null,["\n       \n"])),(l()(),e._28(-1,null,["    "]))],function(l,n){var u=n.component;l(n,290,0,"docSend.lot",u.docSend.lot),l(n,307,0,"docSend.requestedValue",u.docSend.requestedValue)},function(l,n){var u=n.component;l(n,28,0,u.idCompany),l(n,41,0,u.idWallet),l(n,57,0,u.idUser),l(n,70,0,u.idProcess),l(n,86,0,u.process.numberProcess),l(n,99,0,u.user.cpf),l(n,115,0,u.company.cnpj),l(n,128,0,u.company.nameReason),l(n,144,0,u.user.name),l(n,157,0,u.user.idSIR),l(n,173,0,u.expense.codeExpense),l(n,186,0,u.expense.typeExpense),l(n,202,0,u.expense.descriptionExpense),l(n,215,0,u.expense.releaseDay),l(n,231,0,u.wallet.description),l(n,244,0,u.wallet.code),l(n,260,0,u.process.numberProcess),l(n,287,0,e._20(n,292).ngClassUntouched,e._20(n,292).ngClassTouched,e._20(n,292).ngClassPristine,e._20(n,292).ngClassDirty,e._20(n,292).ngClassValid,e._20(n,292).ngClassInvalid,e._20(n,292).ngClassPending),l(n,304,0,e._20(n,309).ngClassUntouched,e._20(n,309).ngClassTouched,e._20(n,309).ngClassPristine,e._20(n,309).ngClassDirty,e._20(n,309).ngClassValid,e._20(n,309).ngClassInvalid,e._20(n,309).ngClassPending)})}var P=e._4("app-document",w,function(l){return e._29(0,[(l()(),e._8(0,0,null,null,8,"app-document",[],null,null,null,I,j)),e._24(512,null,s.a,s.a,[_.e]),e._24(512,null,a.a,a.a,[_.e]),e._24(512,null,i.a,i.a,[_.e]),e._24(512,null,c.a,c.a,[_.e]),e._24(512,null,r.a,r.a,[_.e]),e._24(512,null,p.a,p.a,[_.e]),e._24(512,null,d.a,d.a,[_.e]),e._7(8,114688,null,0,w,[C.f,g.c,f.l,s.a,a.a,i.a,c.a,r.a,p.a,d.a,x.a],null,null)],function(l,n){l(n,8,0)},null)},{},{},[]),k=u("tM+F"),U=u("OylW"),E=u("KU+/"),O=u("c0x3"),F=u("HNiT"),T=u("vEzF"),R=u("6yhf"),M=u("l6RC"),A=u("V8+5"),V=u("ppgG"),q=u("4jwp"),B=u("lvpt"),L=u("OFGE"),W=u("gOiy"),N=u("j5BN"),K=u("KRwK"),z=function(){},H=u("tCmA"),G=u("CZgk"),J=u("ZFRd"),X=u("Ioj9"),Y=u("Lpd/"),Z=u("Zz+K"),Q=u("wnyu"),$=u("tzcA"),ll=u("2waW"),nl=u("PY9B"),ul=u("IBeK"),el=u("g5gQ"),tl=u("xBEz"),ol=u("PuIS"),sl=u("U0Tu"),_l=u("3rU7"),al=u("Cb36"),il=u("5h8W"),cl=u("6ade"),rl=u("4HaF"),pl=u("DaIH");u.d(n,"DocumentModuleNgFactory",function(){return dl});var dl=e._5(t,[],function(l){return e._16([e._17(512,e.j,e._1,[[8,[P,k.a,U.a,E.a,O.a,F.a,T.a,R.a]],[3,e.j],e.y]),e._17(4608,C.l,C.k,[e.v,[2,C.q]]),e._17(4608,o.m,o.m,[]),e._17(6144,M.b,null,[C.c]),e._17(4608,M.c,M.c,[[2,M.b]]),e._17(4608,A.a,A.a,[]),e._17(4608,V.a,V.a,[]),e._17(5120,q.c,q.a,[[3,q.c],e.A,A.a]),e._17(5120,q.f,q.e,[[3,q.f],A.a,e.A]),e._17(4608,B.b,B.b,[[2,"loadingConfig"]]),e._17(4608,L.e,L.e,[q.c,q.f,e.A]),e._17(5120,L.b,L.f,[[3,L.b],C.c]),e._17(4608,L.j,L.j,[q.f,C.c]),e._17(5120,L.c,L.i,[[3,L.c],C.c]),e._17(4608,L.a,L.a,[L.e,L.b,e.j,L.j,L.c,e.g,e.r,e.A,C.c]),e._17(5120,L.g,L.h,[L.a]),e._17(5120,W.a,W.b,[L.a]),e._17(4608,N.a,N.a,[]),e._17(4608,x.a,x.a,[e.j,e.r,K.a]),e._17(512,C.b,C.b,[]),e._17(512,f.p,f.p,[[2,f.u],[2,f.l]]),e._17(512,z,z,[]),e._17(512,o.l,o.l,[]),e._17(512,o.d,o.d,[]),e._17(512,H.a,H.a,[]),e._17(512,M.a,M.a,[]),e._17(256,N.b,!0,[]),e._17(512,N.c,N.c,[[2,N.b]]),e._17(512,G.d,G.d,[]),e._17(512,A.b,A.b,[]),e._17(512,N.g,N.g,[]),e._17(512,V.b,V.b,[]),e._17(512,q.b,q.b,[]),e._17(512,J.a,J.a,[]),e._17(512,B.a,B.a,[]),e._17(512,X.a,X.a,[]),e._17(512,L.d,L.d,[]),e._17(512,N.f,N.f,[]),e._17(512,N.e,N.e,[]),e._17(512,Y.a,Y.a,[]),e._17(512,W.c,W.c,[]),e._17(512,Z.a,Z.a,[]),e._17(512,Q.a,Q.a,[]),e._17(512,$.a,$.a,[]),e._17(512,ll.a,ll.a,[]),e._17(512,nl.a,nl.a,[]),e._17(512,ul.a,ul.a,[]),e._17(512,el.a,el.a,[]),e._17(512,tl.b,tl.b,[]),e._17(512,ol.a,ol.a,[]),e._17(512,sl.a,sl.a,[]),e._17(512,_l.a,_l.a,[]),e._17(512,al.a,al.a,[]),e._17(512,il.a,il.a,[]),e._17(512,cl.a,cl.a,[]),e._17(512,rl.a,rl.a,[]),e._17(512,pl.a,pl.a,[]),e._17(512,h.b,h.b,[]),e._17(512,t,t,[]),e._17(1024,f.j,function(){return[[{path:"",component:w}]]},[])])})}});