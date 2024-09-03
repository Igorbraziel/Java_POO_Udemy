package IntroductionPOO;

public class CurrencyConverter{
    public static double IOF(double dollar){
        return (6.0 / 100.0 * dollar) + dollar; 
    }

    public static double dollarToReais(double dollar_quantity, double dollar_quote){
        return dollar_quantity * dollar_quote;
    }
}