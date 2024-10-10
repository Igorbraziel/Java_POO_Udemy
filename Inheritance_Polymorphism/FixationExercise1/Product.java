package Inheritance_Polymorphism.FixationExercise1;

public class Product {
    public String name;
    public Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String priceTag(){
        return this.name + " $ " + String.format("%.2f", this.price);
    }
}
