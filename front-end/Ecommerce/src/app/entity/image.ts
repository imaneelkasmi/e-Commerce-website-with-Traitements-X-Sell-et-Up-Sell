import { Produit } from './produit';


export class Image {
    id ?: number;
	lable ?: string;
	alt ?: string;
	pruduit ?: Produit;
	constructor(id?: number,lable?: string,alt ?: string,pruduit ?: Produit,){
		this.id = id;
        this.lable=lable;
        this.alt=alt;
        this.pruduit=pruduit;

	}
}
