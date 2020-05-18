import { Component, OnInit } from '@angular/core';
import { CategorieService } from 'src/app/service/categorie.service';
import { Categorie } from 'src/app/entity/categorie';

@Component({
  selector: 'app-side-bar-cate',
  templateUrl: './side-bar-cate.component.html',
  styleUrls: ['./side-bar-cate.component.css']
})
export class SideBarCateComponent implements OnInit {
  allCategories: Array<Categorie>;
  allParnetCategories: Array<Categorie>;
  constructor(
    private categorieSRV: CategorieService
  ) { }

  ngOnInit() {
    this.getCategorie();
    this.getparentCategorie();
  }

  getCategorie(){
    this.categorieSRV.getCategorieSRV().subscribe(
      data => {
        this.allCategories = data;
        /* console.log("show ctae her : ")
        console.log(this.allCategories) */
      },
      err => {
        console.error(err);
      }
    );
  }
  getparentCategorie(){
    this.categorieSRV.getParentCategorieSRV().subscribe(
      data => {
        this.allParnetCategories = data;
        /* console.log("test")
        console.log(this.allCategories) */
      },
      err => {
        console.error(err);
      }
    );
  }

}
