import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { map } from 'rxjs/operators';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class LoginService {
  api = 'http://localhost:8015/api/public';

  constructor(private http: HttpClient,private _router:Router) { }
  login(model: any) {
    return this.http.post(this.api+"/authenticate",model).pipe(
      map((Response:any)=> {
        const user = Response;
        localStorage.setItem('token',user.token);
        this._router.navigate(['/profil'])
      })
    )
  }
  register(model: any){
    /* let headers = new HttpHeaders({}) */
    return this.http.post(this.api+"/register",model);
  }
  loggedIn(){
    return !!localStorage.getItem('token')
  }
  logoutUser() {
    localStorage.removeItem('token')
    this._router.navigate([''])
  }


 
 
}
