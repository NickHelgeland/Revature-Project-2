import { Component, OnInit } from '@angular/core';
import { EncryptService } from '../encrypt.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit { 

  password: string;
  cpassword: string;

  togglePage() {
    this._toggle.toggleLogOut();
  }

  constructor(private _http: HttpClient, private _router: Router, private _encryptor: EncryptService, private _toggle: AppComponent) { }

  ngOnInit() {
  }

  requetP()
  {
    this.cpassword = this._encryptor.hash(this.password);
    this._http.post("http://localhost:9005/Project2Spring/api/change", this.cpassword).subscribe()
  }
  
}
