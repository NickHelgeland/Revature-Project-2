export class User 
{
    firstName: string

    lastName: string

    address: string

    email: string

    constructor(firstname: string, lastname: string, address: string, email:string)
    {
        this.firstName = firstname
        this.lastName = lastname
        this.address = address
        this.email = email
    }
}
