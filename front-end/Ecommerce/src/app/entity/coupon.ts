export class Coupon {

    coupon_id : number;
	code : number;
	status : string;
    discount : number;
    
    constructor(coupon_id : number, code : number, status : string, discount : number){
        this.coupon_id = coupon_id;
        this.code = code;
        this.status = status;
        this.discount = discount;
    }
}
