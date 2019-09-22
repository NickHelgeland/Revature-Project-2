export class Post 
{
    postId: number

    content: string

    owner: string

    constructor(postId: number, content: string, owner: string)
    {
        this.postId = postId
        this.content = content
        this.owner = owner
    }
}
