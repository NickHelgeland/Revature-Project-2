import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-update-form',
  templateUrl: './update-form.component.html',
  styleUrls: ['./update-form.component.css']
})
export class UpdateFormComponent implements OnInit {
  // export class UpdateFormComponent {
  myresponse: any;
  profileData: string;
  profileUpdate: string;
  firstNameUpdateInput: string;
  lastNameUpdateInput: string;
  emailUpdateInput: string;
  addressUpdateInput: string;

  APP_URL = 'http://localhost:9005/Project2Spring/api';

  // public sm = {
    //data from database can either be set here in the empty quotes
    //or we can use the data returned and loop thru it as a for loop
    // firstname: "insert database name here"
  // }
  
  // constructor() { }
  constructor(private _http: HttpClient) {}

  ngOnInit() {
    this._http.get(this.APP_URL + '/getLoggedInUser').subscribe(
      data => {
        this.myresponse = data;
      },
      error => {
        console.log('Error occured', error);
      }
    )
  }

  GetUserData() {
    this._http.get(this.APP_URL + '/updateUser' + this.profileUpdate).subscribe(
      data => {
        this.myresponse = data;
      },
      error => {
        console.log('Error occured', error);
      }
    )
  }

  //add the same method above for the other profile fields, unless we are able to just
  //have 1 method that updates the fields that are entered, without causing
  //blank fields to make profile info null, also need to see they specifics of
  //connecting the method to our database names
  //im thinking we just need a dao method for updating data

}
