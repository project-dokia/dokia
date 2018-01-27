export class User {
    constructor(
        public _id: string,
        public _rev: string,
        public cpf: string,
        public name: string,
        public idSIR: string,
        public idWallet: string,
    ){ }
   
}