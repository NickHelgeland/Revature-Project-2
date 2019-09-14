import { Component, OnInit } from '@angular/core';
import { EventEmitter } from 'events';
import { RoutingService } from '../routing.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  constructor(private routingService: RoutingService) { } 
  
  login()
  {
      this.routingService.emitChange('user-field')
  }

  ngOnInit() {
  }
}
