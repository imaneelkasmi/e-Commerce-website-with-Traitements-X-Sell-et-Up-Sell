import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})

export class LoginService {
  api = 'http://localhost:8015/api/public';

  constructor(private http: HttpClient) { }

//login
  login(model: any) {
    return this.http.post(this.api+"/authenticate",model).pipe(
      map((Response:any)=> {
        const user = Response;
        localStorage.setItem('token',user.token);
      })

    )
  }

  //register
   register(model: any){
    /* let headers = new HttpHeaders({}) */
    return this.http.post(this.api+"/register",model);
  }


}
