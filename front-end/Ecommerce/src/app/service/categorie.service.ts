import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CategorieService {
  api = 'http://localhost:8015/api';

  constructor(private http: HttpClient) { }
  /* token = window.localStorage.getItem('token');
  httpOption = {
    headers: new HttpHeaders({
      'Authorization': 'bearer '+this.token
    })
  }; */
  addcategorie(model: any){
    return this.http.post(this.api+"/categorie",model);
  }
  getCategorieSRV(){
    return this.http.get<any>(this.api+"/public/categorie");
}
getParentCategorieSRV(){
  return this.http.get<any>(this.api+"/parentcategorie");
}
getCategorieByIdSRV(id: number) {
  return this.http.get<any>(this.api + '/public/categorie/' + id);
}
}
