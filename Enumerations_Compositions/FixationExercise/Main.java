package Enumerations_Compositions.FixationExercise;

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int N, quantity;
        String name, email, birthDate, status;
        Double price;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Email: ");
        email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        birthDate = sc.nextLine();

        Client client = new Client(name, email, LocalDate.parse(birthDate, Order.dateFormatter));

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        status = sc.nextLine();

        OrderStatus orderStatus = OrderStatus.valueOf(status);  

        Order order = new Order(LocalDateTime.now(), orderStatus, client);

        System.out.print("How many items to this order? ");
        N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.printf("Enter #%d item data:\n", i);

            System.out.print("Product Name: ");
            sc.nextLine();
            name = sc.nextLine();

            System.out.print("Product Price: ");
            price = sc.nextDouble();

            System.out.print("Quantity: ");
            quantity = sc.nextInt();

            Product product = new Product(name, price);
            OrderItem orderItem = new OrderItem(quantity, price, product);
            
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.print(order);

        sc.close();
    }
}
