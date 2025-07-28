import { Contact } from "./Contact.js"

export default class Annuaire{
    contacts : Contact[]

    constructor(){
        this.contacts = [];
    }

     addBook(contact: Contact){
        this.contacts.push(contact);
    }

    
}