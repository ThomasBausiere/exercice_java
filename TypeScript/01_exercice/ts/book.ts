import { Author } from "./Author.js";

export default interface Book{
    bookName: string,
    author: Author,
    nbr_pages: number,
    isAvailable: boolean
}