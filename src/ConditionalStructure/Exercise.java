package ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salary, income_tax = 0;

        salary = sc.nextDouble();
        
        if (salary >= 0 && salary <= 2000){
            System.out.println("Isento");
        } else if (salary > 2000 && salary <= 3000){
            income_tax = (double) 8 / 100 * salary;
            System.out.printf("R$ %.2f\n", income_tax);
        } else if (salary > 3000 && salary <= 4500) {
            income_tax =  ((double) 8 / 100 * 1000) + ((double) 18 / 100 * (salary - 3000));
            System.out.printf("R$ %.2f\n", income_tax);
        } else if (salary > 4500) {
            income_tax = ((double) 8 / 100 * 1000 + ((double) 18 / 100 * 1500) + ((double) 28 / 100 * (salary - 4500)));
            System.out.printf("R$ %.2f\n", income_tax);
        } 

        sc.close();
    }
}
