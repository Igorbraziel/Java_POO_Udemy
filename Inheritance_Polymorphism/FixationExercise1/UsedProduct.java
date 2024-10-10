package Inheritance_Polymorphism.FixationExercise1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    public final static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    public LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String priceTag(){
        return this.name + " (used) $ " + String.format("%.2f", this.price) + " (Manufacture date: "
        + this.manufactureDate.format(UsedProduct.dateFormatter) + ")";
    }
}
