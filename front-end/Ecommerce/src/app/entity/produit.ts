import { Categorie } from './categorie';
import { Promotion } from './promotion';

export class Produit {
    id?: number;
    name: string;
    price:number;
    marque: string;
    keyword: string;
    stock:number;
    /* sellCount:number; */
    category?: Categorie;
    promotion?: Promotion;
    
    
    constructor(id?: number,name?: string, price?:number,marque?: string,keyword?: string,stock?:number,category?: Categorie, promotion?: Promotion){
        this.id = id;
        this.name=name;
        this.price=price;
        this.marque=marque;
        this.keyword=keyword;
        this.stock=stock;
        /* this.sellCount=sellCount; */
        this.category=category;
        this.promotion=promotion;
    }
}
