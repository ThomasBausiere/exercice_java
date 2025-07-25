export class Author {
    constructor(name, birthDate, genre) {
        this.name = name;
        this.birthDate = birthDate;
        this.genre = genre;
    }
    getDetail() {
        return `Id: ${this.name} - Name : ${this.birthDate} - Email : ${this.genre}`;
    }
}
