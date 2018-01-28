export class Rule {
    constructor(
        public _id: string,
        public _rev: string,
        public type: string,
        public code: string,
        public document: string,
        public typeDocument: string,
        public infoDoc: Array<String>,
    ){ }
}