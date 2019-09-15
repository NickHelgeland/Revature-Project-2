import { Component, OnInit } from '@angular/core';
import { EventEmitter } from 'events';
import { RoutingService } from '../routing.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  credentials = {
      username : "",
      password : ""
  }

  constructor(private routingService: RoutingService, private http: HttpClient) { } 
  
  login()
  {
    this.http.post("localhost:9009/Project2Spring/api/login", this.credentials).subscribe(
      data => {
        if (data == "success")
        {
          this.routingService.emitChange('user-field')
        }
      },
      error => {
        console.log('Error occured', error);
      }
    )
  }

  ngOnInit() {
  }
}
