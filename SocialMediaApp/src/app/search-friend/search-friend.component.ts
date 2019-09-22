import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-search-friend',
  templateUrl: './search-friend.component.html',
  styleUrls: ['./search-friend.component.css']
})
export class SearchFriendComponent implements OnInit {
  
  myresponse; myresp;
  
  APP_URL = 'http://localhost:9005/Project2Spring/api/';

  togglePage() {
    this._toggle.toggleLogOut();
  }

  constructor(private _http: HttpClient, private _toggle: AppComponent) {

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
  
  searchTable() {    
    let input, filter, table, tr, td, tdl, i, txtValue, txtValuel;
    input = document.querySelector("#myInput");
    filter = input.value.toLowerCase();
    table = document.querySelector("#myTable");
    tr = table.querySelectorAll("tr");
    
    for (i = 0; i < tr.length; i++) {
        td = tr[i].querySelectorAll("td")[0];
        tdl = tr[i].querySelector("#tdl");
        if (td || tdl) {
            txtValue = td.textContent || td.innerText;
            txtValuel = tdl.textContent || tdl.innerText;
            if (txtValue.toLowerCase().indexOf(filter) > -1 || txtValuel.toLowerCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        } 
    }
  }

  ngOnInit() { }
}
