import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { LoginService } from '../../services/login.service';



@Component({
  selector: 'mg-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  loginForm = this.formBuilder.group({
    username: ['', Validators.required],
    password: ['', Validators.required]
  });

  constructor( private loginSRV : LoginService,
               private formBuilder: FormBuilder ) { }

  ngOnInit() {}

  getLogin(){
    const loginExcaption = {
      next: x => console.log('you are login' + x),
      error: err => console.log('you are not' + err)
    };
    console.log(this.loginForm.value);
    this.loginSRV.login(this.loginForm.value).subscribe(loginExcaption);
  }



}
