import { Component, OnInit } from '@angular/core';
import { EventEmitter } from 'events';
import { RoutingService } from '../routing.service';
import { HttpClient } from '@angular/common/http';
import { Result } from '../result';

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
    this.http.post("http://localhost:9005/Project2Spring/api/login", this.credentials).subscribe(
      (data: Result) => {
        if (data.result == "success")
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
