export class User {
    constructor(
        public uid: string,
        public cn: string,
        public type_access: string,
        public uidLastChange: string,
        public cnChange: string,
        public lastModifiedData: string,
        public bio: string,
        public email: string,
        public location: string,
        public notesid: string,
        public officephone: string,
        public country: string,
        public _id: string,
        public _rev: string,
        public status: string,
    ){ }
   
}