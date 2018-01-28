export class Rule {
    constructor(
        public name: string,
        public type: string,
        public code: string,
        public document: string,
        public typeDocument: string,
        public infoDoc: Array<String>,
    ){ }
}