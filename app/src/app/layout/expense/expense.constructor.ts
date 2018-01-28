export class Expense {
    constructor(
        public _id: string,
        public _rev: string,
        public typeExpense: string,
        public codeExpense: string,
        public descriptionExpense: string,
        public releaseDay: string,
        public idProcess: string,
    ){ }
}