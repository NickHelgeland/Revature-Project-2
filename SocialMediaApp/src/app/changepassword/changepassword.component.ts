import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RoutingService } from '../routing.service';
import { Result } from '../result';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit {

  User = {
      username : "",
      email : ""
  }

  constructor(private routingService: RoutingService, private http: HttpClient) { }

  login()
  {
      this.http.post("http://localhost:9005/Project2Spring/api/login", this.User).subscribe(
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
