package IntroductionPOO;

import java.util.Locale;
import java.util.Scanner;

public class DollarExercise {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double dollar_quote, dollar_quantity, reais;

        System.out.print("What is the dollar price? ");
        dollar_quote = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        dollar_quantity = sc.nextDouble();

        reais = CurrencyConverter.dollarToReais(CurrencyConverter.IOF(dollar_quantity), dollar_quote);

        System.out.printf("Amount to be paid in reais = %.2f\n", reais);

        sc.close();
    }
}
