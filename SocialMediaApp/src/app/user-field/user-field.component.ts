import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user-field',
  templateUrl: './user-field.component.html',
  styleUrls: ['./user-field.component.css']
})
export class UserFieldComponent implements OnInit { 

  myresponse; myresp;  
  APP_URL = 'http://localhost:9005/Project2Spring/api/';

  tData: string = '';
  likeCounter: number = 0;
  
  constructor(private _http: HttpClient) {

    this._http.get(this.APP_URL + 'getUsers').subscribe(
      data => {
        this.myresponse = data;
        this.myresp = this.myresponse;
      },
      error => {
        console.log('Error occured', error);
      }
    )
   }

  likeCount() {
    this.likeCounter += 1;
  }

  inputData() {
    this.tData = this.tData;
  }
  
  ngOnInit() { }  
}
