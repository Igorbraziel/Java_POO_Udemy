package SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int piece1_number, piece1_code, piece2_number, piece2_code;
        double piece1_value, piece2_value, total_value;
        piece1_code = sc.nextInt();
        piece1_number = sc.nextInt();
        piece1_value = sc.nextDouble();
        piece2_code = sc.nextInt();
        piece2_number = sc.nextInt();
        piece2_value = sc.nextDouble();
        total_value = (piece1_number * piece1_value) + (piece2_number * piece2_value);  

        System.out.printf("VALUE TO PAY: R$ %.2f\n", total_value);

        sc.close();
    }
}
