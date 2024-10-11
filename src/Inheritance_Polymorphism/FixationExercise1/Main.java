package Inheritance_Polymorphism.FixationExercise1;

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N;
        Product product = null;
        List<Product> productsList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.printf("Product #%d data:\n", i);

            System.out.print("Common, used or imported (c/u/i)? ");
            char flag = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if(flag == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), UsedProduct.dateFormatter); 
                product = new UsedProduct(name, price, manufactureDate);
            } else if (flag == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
            } else {
                product = new Product(name, price);
            }

            productsList.add(product);
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product p : productsList){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
