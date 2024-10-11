package SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, difference;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        difference = A * B - C * D;

        System.out.println("DIFFERENCE = " + difference);

        sc.close();
    }
}
