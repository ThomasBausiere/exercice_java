export  class Author {

    private name: string
    private birthDate: number
    private genre: string[]

    constructor(name: string, birthDate: number, genre: string[]){
        this.name = name
        this.birthDate = birthDate
        this.genre = genre
    }

    getDetail(): string {
        return `Id: ${this.name} - Name : ${this.birthDate} - Email : ${this.genre}`
    }

    
}
