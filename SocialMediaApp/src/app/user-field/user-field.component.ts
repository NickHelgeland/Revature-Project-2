import { Component, OnInit } from '@angular/core';
import { AppComponent } from '../app.component';
import { s3 } from 'fine-uploader/lib/core/s3';

@Component({
  selector: 'app-user-field',
  templateUrl: './user-field.component.html',
  styleUrls: ['./user-field.component.css']
})
export class UserFieldComponent implements OnInit { 

  async uploadFile(event)
  {
    let file = event.target.files[0]
    let urlResponse = await fetch('http://localhost:9005/Project2Spring/api/s3/' + file.name, {
      method: 'PUT'
    })
    let signedUrl = await urlResponse.text()

    let s3Response = await fetch(signedUrl, {
      method: 'PUT',
      body: file
    })
  }
  tData: string = '';
  likeCounter: number = 0;
  
  constructor() { }

  likeCount() {
    this.likeCounter += 1;
  }
  
  ngOnInit() { }  
}
