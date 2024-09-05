package MemoryBehavior_Arrays_Lists;

import java.util.Locale;
import java.util.Scanner;

public class Negatives {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("How many numbers will you enter? ");
        N = sc.nextInt();

        int[] vector = new int[N];

        for(int i = 0; i < N; i++){
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS:");

        for(int i = 0; i < N; i++){
            if(vector[i] < 0){
                System.out.println(vector[i]);
            }
        }

        sc.close();
    }

}