export default class Librairy {
    constructor() {
        this.books = [];
    }
    addBook(book) {
        this.books.push(book);
    }
    removeBook(title) {
        const bookToRemove = this.books.find(title => title = title);
        const indexOfTheBookToRemove = this.books.indexOf(bookToRemove);
        console.log("deleting: " + bookToRemove.bookName);
        this.books.splice(indexOfTheBookToRemove, 1);
        console.log("deleted");
    }
    findBookByTitle(title) {
        const bookToFind = this.books.find(title => title = title);
        console.log(bookToFind);
        return bookToFind;
    }
    listAvailableBooks() {
        let listOfAvaiableBooks = this.books.filter(b => b.isAvailable === true);
        console.log(listOfAvaiableBooks);
    }
}
