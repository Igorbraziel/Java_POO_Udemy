package MemoryBehavior_Arrays_Lists;

import java.util.Locale;
import java.util.Scanner;

public class VectorExample2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N;
        String name;
        double price, sum = 0, average;
        N = sc.nextInt();
        Product[] productVector = new Product[N];

        for(int i = 0; i < N; i++){
            sc.nextLine();
            name = sc.nextLine();
            price = sc.nextDouble();
            productVector[i] = new Product(name, price);
        }

        for(int i = 0; i < N; i++){
            sum += productVector[i].getPrice();
        }   
        
        average = sum / N;

        System.out.printf("AVERAGE PRICE = %.2f\n", average);

        sc.close();
    }
}
