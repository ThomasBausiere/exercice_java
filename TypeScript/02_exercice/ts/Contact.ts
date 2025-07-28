export class Contact {

    private firstName: string
    private lastName: string
    private birthDate: Date
    private email: string
    private phone: string
    private avatarUrl: string

    constructor(firstName: string, lastName: string, birthDate: Date, email: string, phone: string, avatarUrl :string ){
        this.firstName = firstName
        this.lastName = lastName
        this.birthDate = birthDate
        this.email = email
        this.phone = phone
        this.avatarUrl = avatarUrl
    }

    getDetail(): string {
        return `firstName: ${this.firstName} - LastName :${this.lastName} - BirthDate: ${this.birthDate} - Email : ${this.email} - Phone -${this.phone} - avatarUrl : ${this.avatarUrl}`
    }

    
}