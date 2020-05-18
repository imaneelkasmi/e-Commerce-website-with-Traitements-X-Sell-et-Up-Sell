import { Component, OnInit } from '@angular/core';
import { Produit } from 'src/app/entity/produit';
import { ActivatedRoute } from '@angular/router';
import { ProduitService } from 'src/app/service/produit.service';
@Component({
  selector: 'app-body-produit',
  templateUrl: './body-produit.component.html',
  styleUrls: ['./body-produit.component.css']
})
export class BodyProduitComponent implements OnInit {
  _dataProduit: Array<Produit>;
  _idProduit: number ;
  constructor(
    private _route :ActivatedRoute,
    private produitSRV: ProduitService,
  ) { }

  ngOnInit() {
    this._route.params.subscribe(params => {
      
       // reset and set based on new parameter this time
      this._idProduit = params['id'];
      this.getCtegorieById(this._idProduit)
  });
  }

  getCtegorieById(x : number){
    this.produitSRV.getProduitByIdSRV(x).subscribe(
      data => {
        this._dataProduit = data;
        console.log(this._dataProduit)
      },
      err => {
        console.error(err);
      }
    );
   }

}
