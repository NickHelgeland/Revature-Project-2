import { Post } from './post'

export class User 
{
    firstName: string

    lastName: string

    address: string

    email: string

    postList: Array<Post>;

    constructor(firstname: string, lastname: string, address: string, email:string)
    {
        this.firstName = firstname
        this.lastName = lastname
        this.address = address
        this.email = email
    }
}
