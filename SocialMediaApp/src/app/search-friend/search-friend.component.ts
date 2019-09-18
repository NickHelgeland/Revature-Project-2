import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';


@Component({
  selector: 'app-search-friend',
  templateUrl: './search-friend.component.html',
  styleUrls: ['./search-friend.component.css']
})
export class SearchFriendComponent implements OnInit {

  userSF:string='';

  myresponse: any;
  myresp: any;

  APP_URL = 'http://localhost:9009/Project2Spring/api/';

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

  ngOnInit() {
   
  }

  Search(){
    if(this.userSF != ''){
      this.myresponse = this.myresponse.filter(res => {
        return res.firstName.toLocaleLowerCase .match(this.userSF.toLocaleLowerCase)
      })
    }else if(this.userSF == null){
      this.myresponse = this.myresp;
    }

   
  }

}
