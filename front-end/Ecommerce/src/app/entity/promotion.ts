export class Promotion {
    id?: number;
    status?: string;
    percent?:number;
    beginDate?:Date;
    endDate?:Date;
    constructor(id?: number,status?: string,percent?:number,beginDate?:Date,endDate?:Date){
    this.id = id;
    this.status = status;
    this.percent = percent;
    this.beginDate = beginDate;
    this.endDate = endDate;

    }
    
}
