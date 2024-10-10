package Inheritance_Polymorphism.FixationExercise1;

public class ImportedProduct extends Product {
    public Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return this.customsFee + this.price;
    }

    @Override
    public String priceTag(){
        return this.name + " $ " + String.format("%.2f", this.totalPrice())
        + String.format(" (Customs fee: $ %.2f)", this.customsFee);
    }
}
