import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {
  api = 'http://localhost:8015/api';

  constructor(private http: HttpClient) { }
  addProduitSRV(model: any){
    return this.http.post(this.api+"/produit",model);
  }
  getProduitByIdSRV(id: number) {
    return this.http.get<any>(this.api + '/public/produit/' + id);
  }
}
