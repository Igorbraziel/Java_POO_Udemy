package IntroductionPOO;

import java.util.Locale;
import java.util.Scanner;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return quantity * price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        if(quantity >= this.quantity) {
            this.quantity = 0;
        } else this.quantity -= quantity;
    }

    public String toString(){
        return this.name 
        + ", $ " 
        + String.format("%.2f", this.price) 
        + ", " 
        + this.quantity 
        + " units, Total: $ " 
        + this.totalValueInStock();

    }

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product prod = new Product();
        int added, removed;

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        prod.name = sc.nextLine();

        System.out.print("Price: ");
        prod.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        prod.quantity = sc.nextInt();
        System.out.print("\n");

        System.out.println("Product data: " + prod);

        System.out.print("\nEnter the number of products to be added in stock: ");
        added = sc.nextInt();
        prod.addProducts(added);
        System.out.println("\nUpdate data: " + prod);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        removed = sc.nextInt();
        prod.removeProducts(removed);
        System.out.println("\nUpdate data: " + prod);

        sc.close();
    }
}
