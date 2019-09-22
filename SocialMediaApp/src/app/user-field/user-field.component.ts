import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AppComponent } from '../app.component';
import { SessionService } from '../session.service';
import { User } from '../user';
import { Post } from '../post';

@Component({
  selector: 'app-user-field',
  templateUrl: './user-field.component.html',
  styleUrls: ['./user-field.component.css']
})
export class UserFieldComponent implements OnInit {

  tData: string;
  tDatas: Array<string> = [];
  like: number = 0;
  likes: Array<number> = [];

  baseUrl: string = "http://localhost:9005/Project2Spring/api/"

  src: string = "../../assets/user.png"

  user: User

  likeCount() {
    this.like += 1;
    this.likes.push(this.like);    
  }

  inputData() {
    if (this.tData !== '' && this.tData !== null) {
      this.tDatas.push(this.tData);
      this.tData = '';
    }
  }

  async uploadFile(event) {
    let file = event.target.files[0]
    let urlResponse = await fetch(this.baseUrl + 's3/' + file.name, {
      method: 'PUT'
    })
    let signedUrl = await urlResponse.text()

    let s3Response = await fetch(signedUrl, {
      method: 'PUT',
      body: file
    })
    this.updateProfilePicture(file.name)
    this.getFile()
  }

  updateProfilePicture(filename: string) {
    let image = {
      name: filename,
      username: this._session.getUsername()
    }

    this._http.post(this.baseUrl + 'updateImage', image).subscribe()
    alert("Image has been uploaded")
  }

  async getFile() {
    let getImageRespone = await fetch(this.baseUrl + 'getProfilePic/' + this._session.username, {
      method: 'GET'
    })
    let imageName = await getImageRespone.text()

    let urlResponse = await fetch(this.baseUrl + 's3/' + imageName, {
      method: 'GET'
    });
    let signedUrl = await urlResponse.text();

    this.src = signedUrl
  }

  getUserInformation(username: string) {
    this._http.get(this.baseUrl + 'getLoggedInUser/' + username).subscribe(
      (data: User) => {
        this.user = data
      }
    )
  }

  constructor(private _http: HttpClient, private _session: SessionService, private _toggle: AppComponent) {
    this.getFile()
    this.getUserInformation(this._session.username)
  }

  togglePage() {
    this._toggle.toggleLogOut();
  }

  ngOnInit() { }
}
