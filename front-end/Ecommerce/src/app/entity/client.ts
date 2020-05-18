export class Client {
    
     lastName: string;
	 firstName: string;
	 email: string;
	 adresse: string;
	 infoPaiement: string;
     phone: string;

    constructor(lastName: string,firstName: string,email: string, adresse: string,infoPaiement: string,phone: string){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.adresse = adresse;
        this.infoPaiement = infoPaiement;
        this.phone = phone;
    }
}
