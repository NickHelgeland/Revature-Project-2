import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'SocialMediaApp';
  isOn: boolean = true;
  is_On: boolean = false;
  
  togglePage() {
    if(this.isOn) {
      this.isOn = false;
      this.is_On;
    } else {
      this.is_On;
      this.isOn = true;
    }
  }
  
}
