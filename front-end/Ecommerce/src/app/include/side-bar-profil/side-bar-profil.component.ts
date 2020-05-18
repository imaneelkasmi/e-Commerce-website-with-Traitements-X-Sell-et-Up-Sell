import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/service/login.service';

@Component({
  selector: 'app-side-bar-profil',
  templateUrl: './side-bar-profil.component.html',
  styleUrls: ['./side-bar-profil.component.css']
})
export class SideBarProfilComponent implements OnInit {

  constructor(private _loginSRV:LoginService) { }

  ngOnInit() {
  }

}
