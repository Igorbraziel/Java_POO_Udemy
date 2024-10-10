package Enumerations_Compositions.FixationExercise;

public class OrderItem {
    public Integer quantity;
    public Double price;
    public Product product;

    public OrderItem(Integer quantity, Double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subTotal(){
        return this.price * this.quantity;
    }
}
