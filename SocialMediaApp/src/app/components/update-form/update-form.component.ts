import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { SessionService } from 'src/app/session.service';

@Component({
  selector: 'app-update-form',
  templateUrl: './update-form.component.html',
  styleUrls: ['./update-form.component.css']
})
export class UpdateFormComponent implements OnInit {
  myresponse: any;
  profileDataInput = {
    username : this._session.username,
    firstName: "",
    lastName: "",
    email:"",
    address:""
  }

  APP_URL = 'http://localhost:9005/Project2Spring/api';
  
  constructor(private _http: HttpClient, private _session: SessionService) {}

  ngOnInit() {
    this._http.get(this.APP_URL + '/getLoggedInUser/' + this._session.username).subscribe(
      data => {
        this.myresponse = data;
      },
      error => {
        console.log('Error occured', error);
      }
    )
  }

  updateProfile(){
    this.profileDataInput.firstName=this.myresponse.firstName;
    this.profileDataInput.lastName=this.myresponse.lastName;
    this.profileDataInput.email=this.myresponse.email;
    this.profileDataInput.address=this.myresponse.address;

    this._http.post("http://localhost:9005/Project2Spring/api/updateUser", this.profileDataInput).subscribe()
  }

}
