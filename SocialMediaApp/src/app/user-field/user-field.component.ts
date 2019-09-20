import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-field',
  templateUrl: './user-field.component.html',
  styleUrls: ['./user-field.component.css']
})
export class UserFieldComponent implements OnInit { 

  tData: string = '';
  likeCounter: number = 0;
  
  constructor() { }

  likeCount() {
    this.likeCounter += 1;
  }
  
  ngOnInit() { }  
}
