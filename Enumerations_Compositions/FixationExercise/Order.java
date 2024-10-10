package Enumerations_Compositions.FixationExercise;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Order {
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public LocalDateTime moment;
    public OrderStatus status;
    public List<OrderItem> items = new ArrayList<>();
    public Client client;

    public Order(LocalDateTime moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.remove(item);
    }

    public Double total(){
        Double totalPrice = 0.0;
        for(OrderItem item : items){
            totalPrice += item.subTotal();
        }
        return totalPrice;
    }

    public String returnItems(){
        String itemsString = "";
        for(OrderItem item : this.items){
            itemsString += item.product.name + ", $" + String.format("%.2f", item.price) + ", Quantity: " + item.quantity + ", Subtotal: $" + String.format("%.2f", item.subTotal()) + "\n";
        }
        return itemsString;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Order moment: " + this.moment.format(Order.dateTimeFormatter) + "\n");
        stringBuilder.append("Order status: " + this.status.toString().substring(0, 1).toUpperCase() + this.status.toString().substring(1).toLowerCase() + "\n");
        stringBuilder.append("Client: " + this.client + "\n");
        stringBuilder.append("Order items:\n" + this.returnItems());
        stringBuilder.append(String.format("Total price: $%.2f\n", this.total()));

        return stringBuilder.toString();
    }
}
