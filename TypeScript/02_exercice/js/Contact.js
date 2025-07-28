export class Contact {
    constructor(firstName, lastName, birthDate, email, phone, avatarUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.avatarUrl = avatarUrl;
    }
    getDetail() {
        return `firstName: ${this.firstName} - LastName :${this.lastName} - BirthDate: ${this.birthDate} - Email : ${this.email} - Phone -${this.phone} - avatarUrl : ${this.avatarUrl}`;
    }
}
