import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search-friend',
  templateUrl: './search-friend.component.html',
  styleUrls: ['./search-friend.component.css']
})
export class SearchFriendComponent implements OnInit {

  searchText: string;
  myresponse; myresp;
  
  APP_URL = 'http://localhost:9005/Project2Spring/api/';

  constructor(private _http: HttpClient) {

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
  
  // Search() {
  //   let search_input: any = this.searchText.toLowerCase().toString();
  //   if(search_input != '' || search_input != null) {
  //     this.myresponse = this.myresponse.filter(res => {
  //     return res.firstName.toLowerCase().match(search_input) })
  //     // this.myresponse = this.myresponse.filter(search_input);      
  //   }else {
  //     console.log('Please input something');
  //   }
  // }

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
