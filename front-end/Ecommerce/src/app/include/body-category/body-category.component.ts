import { Component, OnInit, Input } from '@angular/core';
import { Categorie } from 'src/app/entity/categorie';
import { CategorieService } from 'src/app/service/categorie.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-body-category',
  templateUrl: './body-category.component.html',
  styleUrls: ['./body-category.component.css']
})
export class BodyCategoryComponent implements OnInit {
  @Input() _idCate:number;
  _dataOfCate: Array<Categorie>;

  constructor(
    private categorieSRV: CategorieService,
    private _route :ActivatedRoute,
  ) { 
    
  }

  ngOnInit() {
    this._route.params.subscribe(params => {
      this._idCate = params['id'];
      this.getCtegorieById(); // reset and set based on new parameter this time
  });
  }

   getCtegorieById(){
    this.categorieSRV.getCategorieByIdSRV(this._idCate).subscribe(
      data => {
        this._dataOfCate = data;
        console.log("cate by id of child")
        console.log(this._dataOfCate)
      },
      err => {
        console.error(err);
      }
    );
   }

}
