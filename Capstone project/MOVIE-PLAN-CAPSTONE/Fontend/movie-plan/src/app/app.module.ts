import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { AuditoriumForumsComponent } from './auditorium-forums/auditorium-forums.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { FooterComponent } from './footer/footer.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { LayoutComponent } from './login/layout/layout.component';
import { ManageComponent } from './home/manage/manage.component';
import { MoviesComponent } from './movies/movies.component';
import { MovieFormsComponent } from './movies/movie-forms/movie-forms.component';
import { MybookingsComponent } from './mybookings/mybookings.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterComponent } from './register/register.component';
import { AddMoviesComponent } from './add-movies/add-movies.component';
import { PaymentFormComponent } from './add-movies/payment-form/payment-form.component';
import { ScreenComponent } from './add-movies/screen/screen.component';
import { SelectMembersComponent } from './add-movies/select-members/select-members.component';
import { ShowFormComponent } from './add-movies/show-form/show-form.component';

@NgModule({
  declarations: [
    AppComponent,
    AboutUsComponent,
    AuditoriumForumsComponent,
    ContactUsComponent,
    FooterComponent,
    ForgotPasswordComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    LayoutComponent,
    ManageComponent,
    MoviesComponent,
    MovieFormsComponent,
    MybookingsComponent,
    ProfileComponent,
    RegisterComponent,
    AddMoviesComponent,
    PaymentFormComponent,
    ScreenComponent,
    SelectMembersComponent,
    ShowFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
