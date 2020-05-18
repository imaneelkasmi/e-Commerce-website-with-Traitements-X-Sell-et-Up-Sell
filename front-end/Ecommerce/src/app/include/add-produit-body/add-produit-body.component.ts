import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ProduitService } from 'src/app/service/produit.service';
import { CategorieService } from 'src/app/service/categorie.service';
import { Categorie } from 'src/app/entity/categorie';
import { Promotion } from 'src/app/entity/promotion';
import { Produit } from 'src/app/entity/produit';
import { ImageProduitService } from 'src/app/service/image-produit.service';
import { Image } from 'src/app/entity/image';

@Component({
  selector: 'app-add-produit-body',
  templateUrl: './add-produit-body.component.html',
  styleUrls: ['./add-produit-body.component.css']
})
export class AddProduitBodyComponent implements OnInit {
  allCategories: Array<Categorie>;
  allCategories2: Array<Categorie>;
  addProduitForm = this.formBuilder.group({
    name: ['', Validators.required],
    keyword: ['', Validators.required],
    marque: ['', Validators.required],
    stock: ['', Validators.required],
    price: ['', Validators.required],
    Categore_id:['', Validators.required],
    image1:['', Validators.required],
    alt1:['', Validators.required],
    image2:['', Validators.required],
    alt2:['', Validators.required],
    image3:['', Validators.required],
    alt3:['', Validators.required]
  });
  addCtegoryForm =  this.formBuilder.group({
    lable: [''],
    parent_id: ['0']
    /* parent_id: ['', Validators.required] */
    
  });
  

  constructor(
    private formBuilder: FormBuilder,
    private produitSRV: ProduitService,
    private categorieSRV: CategorieService,
    private imageProduitSRV: ImageProduitService
  ) { }

  ngOnInit() {
    this.getparentCategorie();
    this.getAllCategorie();
  }
  addProduit(){
    let _rep;
    const registerExcaption = {
      next: x => {
      _rep =x;
        this.addImageProduit(x,this.addProduitForm.value.image1.slice(12, 100),this.addProduitForm.value.alt1)
        this.addImageProduit(x,this.addProduitForm.value.image2.slice(12, 100),this.addProduitForm.value.alt2)
        this.addImageProduit(x,this.addProduitForm.value.image3.slice(12, 100),this.addProduitForm.value.alt3)
    },
      error: err => console.log('you are not' + err)
    };
    let _Promotion = new Promotion(1);
    console.log( _Promotion)
    let _cateOfProduit = new Categorie(this.addProduitForm.value.Categore_id);
    let _Produit = new Produit(0,
      this.addProduitForm.value.name,
      this.addProduitForm.value.price,
      this.addProduitForm.value.marque,
      this.addProduitForm.value.keyword,
      this.addProduitForm.value.stock,
      _cateOfProduit,
      _Promotion
    );

      console.log(_Produit)
    this.produitSRV.addProduitSRV(_Produit).subscribe(registerExcaption);
  }

  addCtegory(){
    const registerExcaption = {
      next: x => console.log('secces add cate' + x),
      error: err => console.log('not add cate' + err)
    };
    let _categorieParent = new Categorie(this.addCtegoryForm.value.parent_id);
    let _categorie = new Categorie(0,this.addCtegoryForm.value.lable,_categorieParent)
    console.log(_categorie)
    this.categorieSRV.addcategorie(_categorie).subscribe(registerExcaption);
  }
  getparentCategorie(){
    this.categorieSRV.getParentCategorieSRV().subscribe(
      data => {
        this.allCategories = data;
        /* console.log("test")
        console.log(this.allCategories) */
      },
      err => {
        console.error(err);
      }
    );
  }
  getAllCategorie(){
    this.categorieSRV.getCategorieSRV().subscribe(
      data => {
        this.allCategories2 = data;
        /* console.log("test")
        console.log(this.allCategories) */
      },
      err => {
        console.error(err);
      }
    );
  }
  addImageProduit(idProduit : number, lable:string, alt:string){
    const registerExcaption = {
      next: x => console.log('secces add cate' + x),
      error: err => console.log('not add cate' + err)
    };
    let _produit = new Produit(idProduit);
    let _imgProduit = new Image(0,lable,alt,_produit);
    this.imageProduitSRV.addImageProduit(_imgProduit).subscribe(registerExcaption);
    
  }

}
