package SequentialStructure;

import java.util.Scanner;
import java.util.Locale;

public class Exercise2{

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi, ray, area;
        pi = Math.PI;
        ray = sc.nextDouble();
        area = pi * (Math.pow(ray, 2));

        System.out.printf("A=%.4f\n", area);

        sc.close();
    }

}