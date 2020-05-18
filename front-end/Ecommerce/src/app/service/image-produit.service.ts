import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ImageProduitService {
  api = 'http://localhost:8015/api';

  constructor(private http: HttpClient) { }
  addImageProduit(model: any){
    return this.http.post(this.api+"/image",model);
  }
}
