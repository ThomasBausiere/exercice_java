import Book from "./book.js"

export default class Librairy{
    books: Book[] 

    constructor(){
        this.books =[]; 
    }

    addBook(book: Book){
        this.books.push(book);
    }
    
    removeBook(title: string){
        const bookToRemove: Book = this.books.find(title => title = title);
        const indexOfTheBookToRemove: number = this.books.indexOf(bookToRemove);
        console.log("deleting: "+bookToRemove.bookName);
        this.books.splice(indexOfTheBookToRemove, 1);
        console.log("deleted");
        
    }
    
    findBookByTitle(title: string): Book{
        const bookToFind: Book = this.books.find(title => title = title);
        console.log(bookToFind);
        
        return bookToFind;
    }

    
    listAvailableBooks(){
        let listOfAvaiableBooks = this.books.filter(b=>b.isAvailable===true)
        console.log(listOfAvaiableBooks);
        
    }
}
