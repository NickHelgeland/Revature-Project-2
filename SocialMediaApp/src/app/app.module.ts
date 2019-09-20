import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { PassRecoveryComponent } from './pass-recovery/pass-recovery.component';
import { UserFieldComponent } from './user-field/user-field.component';
import { HomeComponent } from './home/home.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { UserMenuComponent } from './user-menu/user-menu.component';
import { UpdateFormComponent } from './components/update-form/update-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { SearchFriendComponent } from './search-friend/search-friend.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { InvitationComponent } from './invitation/invitation.component';

@NgModule({
  declarations: [
    AppComponent,
    SignUpComponent,
    SignInComponent,
    PassRecoveryComponent,
    UserFieldComponent,
    HomeComponent,
    UserProfileComponent,
    UserMenuComponent,    
    UpdateFormComponent,
    SearchFriendComponent,    
    InvitationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule    
  ],
  providers: [AppComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
