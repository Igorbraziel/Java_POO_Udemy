package RepetitiveStructures;

import java.util.Scanner;
import java.util.Locale;

public class DoWhile {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        char flag;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            celsius = sc.nextDouble();
            fahrenheit = (9 * celsius / 5) + 32;
            System.out.println("Fahrenheit equivalent: " + fahrenheit);
            System.out.print("Do you want to repeat (y/n)? ");
            flag = sc.next().charAt(0);
        } while(flag != 'n');

        sc.close();
    }
}
