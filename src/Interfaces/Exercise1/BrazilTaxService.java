package Interfaces.Exercise1;

public class BrazilTaxService implements TaxService {
    public Double tax(Double amount){
        if(amount <= 100){
            return amount * 0.2;
        }  

        return amount * 0.15;
    }
}
