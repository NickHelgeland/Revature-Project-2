import { Component, OnInit } from '@angular/core';
import { EncryptService } from '../encrypt.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AppComponent } from '../app.component';
import { SessionService } from '../session.service';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit { 

  password: string;
  cpassword: string;

  updateInfo = {
    username : this._session.username, 
    password : ""
  }

  togglePage() {
    this._toggle.toggleLogOut();
  }

  constructor(private _http: HttpClient, private _router: Router, private _encryptor: EncryptService, 
    private _toggle: AppComponent, private _session: SessionService) { }

  ngOnInit() {
  }

  requetP()
  {
    this.updateInfo.password = this._encryptor.hash(this.cpassword)
    this._http.post("http://localhost:9005/Project2Spring/api/passwordReset", this.updateInfo).subscribe()
  }
  
}
