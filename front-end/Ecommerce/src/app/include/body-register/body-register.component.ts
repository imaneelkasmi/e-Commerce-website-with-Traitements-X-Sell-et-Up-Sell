import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { LoginService } from 'src/app/service/login.service';

@Component({
  selector: 'app-body-register',
  templateUrl: './body-register.component.html',
  styleUrls: ['./body-register.component.css']
})
export class BodyRegisterComponent implements OnInit {
  loginForm = this.formBuilder.group({
    username: ['loutfallah', Validators.required],
    password: ['1234', Validators.required]
  });
  registerForm = this.formBuilder.group({
    username: ['', Validators.required],
    password: ['', Validators.required],
    email: ['', Validators.required]
  });

  constructor(
    private loginSRV:LoginService,
    private formBuilder: FormBuilder
  ) { }

  ngOnInit() {
  }
  getLogin(){
    const loginExcaption = {
      next: x => console.log('you are login' + x),
      error: err => console.log('you are not' + err)
    };
    console.log(this.loginForm.value);
    this.loginSRV.login(this.loginForm.value).subscribe(loginExcaption);
  }
  getRegister(){
    const registerExcaption = {
      next: x => console.log('you are login' + x),
      error: err => console.log('you are not' + err)
    };
    this.loginSRV.register(this.registerForm.value).subscribe(registerExcaption);
  }

}
