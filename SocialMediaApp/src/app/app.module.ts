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

@NgModule({ // put here our components
  declarations: [
    AppComponent,
    SignUpComponent,
    SignInComponent,
    PassRecoveryComponent,
    UserFieldComponent,
    HomeComponent,
    UserProfileComponent,
    UserMenuComponent    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
