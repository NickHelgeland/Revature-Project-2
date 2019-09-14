import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-update-form',
  templateUrl: './update-form.component.html',
  styleUrls: ['./update-form.component.css']
})
// export class UpdateFormComponent implements OnInit {
  export class UpdateFormComponent {
  myresponse: any;

  APP_URL = 'http://localhost:9005/AngularSpringMVC';

  // public sm = {
    //data from database can either be set here in the empty quotes
    //or we can use the data returned and loop thru it as a for loop
    // firstname: "insert database name here"
  // }
  
  // constructor() { }

  // ngOnInit() {
  // }

  constructor(private _http: HttpClient) {}

  getAllEmployees() {
    this._http.get(this.APP_URL + '/getemployees').subscribe(
      data => {
        this.myresponse = data;
      },
      error => {
        console.log('Error occured', error);
      }
    )
  }

}
