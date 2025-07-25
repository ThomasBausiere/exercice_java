import { Author } from "./Author.js";
import Librairy from "./Librairy.js";
let author = new Author("Toto", 2000, ["Polar", "Romance", "Sf"]);
let author2 = new Author("Tati", 1990, [, "Romance", "Sf"]);
function createBook(bookName, author, nbr_pages, isAvailable = true) {
    let newBook = {
        bookName: bookName,
        author: author,
        nbr_pages: nbr_pages,
        isAvailable
    };
    return newBook;
}
function toggleAvailability(book) {
    book.isAvailable = !book.isAvailable;
}
let booknmb1 = createBook("livre1", author, 200, false);
let booknmb2 = createBook("livre2", author, 170, false);
let booknmb3 = createBook("livre3", author2, 300);
let booknmb4 = createBook("livre4", author2, 670);
let newLibrairy = new Librairy;
newLibrairy.addBook(booknmb1);
newLibrairy.addBook(booknmb2);
newLibrairy.addBook(booknmb3);
newLibrairy.addBook(booknmb4);
console.log(newLibrairy.books);
// newLibrairy.findBookByTitle("livre1");
// toggleAvailability(booknmb1);
//newLibrairy.removeBook('livre1');
// newLibrairy.findBookByTitle("livre1");
// console.log(newLibrairy.books);
// newLibrairy.findBookByTitle("livre1");
newLibrairy.listAvailableBooks();
console.log(newLibrairy.books);
