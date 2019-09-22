import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AppComponent } from '../app.component';
import { SessionService } from '../session.service';

@Component({
  selector: 'app-user-field',
  templateUrl: './user-field.component.html',
  styleUrls: ['./user-field.component.css']
})
export class UserFieldComponent implements OnInit {

  baseUrl: string = "http://localhost:9005/Project2Spring/api/"

  tData: string = '';
  likeCounter: number = 0;

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
  }

  updateProfilePicture(filename: string) {
    let image = {
      name: filename,
      username: this._session.getUsername()
    }

    this._http.post(this.baseUrl + 'updateImage', image).subscribe()
    alert("Image has been uploaded")
  }

  likeCount() {
    this.likeCounter += 1;
  }

  inputData() {
    this.tData = this.tData;
  }

  togglePage() {
    this._toggle.toggleLogOut();
  }

  constructor(private _http: HttpClient, private _session: SessionService, private _toggle: AppComponent) { }  

  ngOnInit() { }
}
