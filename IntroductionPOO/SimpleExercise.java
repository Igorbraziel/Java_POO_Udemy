package IntroductionPOO;

import java.util.Locale;
import java.util.Scanner;

public class SimpleExercise{

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, y, z;
        double Xarea, Yarea;

        System.out.println("Enter the measures of triangle X:");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");

        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();

        Xarea = triangleArea(a, b, c, pFunction(a, b, c));
        Yarea = triangleArea(x, y, z, pFunction(x, y, z));

        System.out.printf("Triangle X area: %.4f\n", Xarea);
        System.out.printf("Triangle Y area: %.4f\n", Yarea);

        System.out.print("Larger Area: ");

        if(Xarea > Yarea){
            System.out.println("X");
        } else {
            System.out.println("Y");
        }

        sc.close();
    }

    public static double pFunction(double a, double b, double c){
        return (a + b + c) / 2;
    }

    public static double triangleArea(double a, double b, double c, double p){
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
}