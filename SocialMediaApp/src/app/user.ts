export class User 
{
    firstname: string

    lastname: string

    address: string

    email: string

    constructor(firstname: string, lastname: string, address: string, email:string)
    {
        this.firstname = firstname
        this.lastname = lastname
        this.address = address
        this.email = email
    }
}
