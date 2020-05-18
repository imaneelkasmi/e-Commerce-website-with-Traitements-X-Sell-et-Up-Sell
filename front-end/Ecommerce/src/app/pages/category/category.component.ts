import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CategorieService } from 'src/app/service/categorie.service';
import { Categorie } from 'src/app/entity/categorie';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {
  _dataOfCate: Array<Categorie>;
  _idCate: number ;
  
  constructor(
    private _route :ActivatedRoute,
    private _navRouter: Router,
    private categorieSRV: CategorieService,
  ) { 
    
  }
  /* getId(){
    return this._idCate = this._route.snapshot.params['id'];
  } */

  ngOnInit() {
    let id;
    this._route.params.subscribe(params => {
      id = params['id'];
      this.getCtegorieById(id); // reset and set based on new parameter this time
      this._idCate = params['id'];
  });
   
    /* let _idCate = this.getId(); */
    /* this.getCtegorieById(_idCate); */
    /* this._navRouter.events.subscribe((val) => this.getId()); */
  }
  /* _idCate = parseInt(this._route.snapshot.paramMap.get['id']); */
  getCtegorieById(x : number){
    this.categorieSRV.getCategorieByIdSRV(x).subscribe(
      data => {
        this._dataOfCate = data;
      },
      err => {
        console.error(err);
      }
    );
   }

}
