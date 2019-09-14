import { Component, OnInit } from '@angular/core';
import { EventEmitter } from 'events';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  submit = new EventEmitter();

  constructor() {    
  }  

  ngOnInit() {
  }

//   const self = this;
//   dialog.componentInstance.submit.subscribe({
//    next(value) {
//       self.isOn = false;
//    }
// });

}
