export class Categorie {
    
    id?: number;
    lable: string;
    parent?: Categorie;

    
    
    constructor(id?: number, lable?: string,parent?: Categorie){
        this.id = id;
        this.lable = lable;
        this.parent = parent;
    }
}
