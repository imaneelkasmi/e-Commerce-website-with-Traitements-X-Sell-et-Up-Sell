import { Injectable } from '@angular/core';
/* import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router'; */
import { CanActivate, Router} from '@angular/router';
import { Observable } from 'rxjs';
import { LoginService } from './service/login.service';


@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {

  constructor(
    private _loginSRV:LoginService,
    private _router:Router) { }
    canActivate(): boolean {
      if (this._loginSRV.loggedIn()) {
        console.log('true')
        return true
      } else {
        console.log('false')            
        this._router.navigate(['/register'])
        return false
      }
    }
  
}
