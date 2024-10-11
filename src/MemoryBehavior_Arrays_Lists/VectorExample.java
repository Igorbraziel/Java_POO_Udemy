package MemoryBehavior_Arrays_Lists;

import java.util.Locale;
import java.util.Scanner;

public class VectorExample { 

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0, average;

        for(int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            sum += vect[i];
        }

        average = sum / n;

        System.out.println("AVERAGE HEIGHT: " + average);

        sc.close();
    }

}
