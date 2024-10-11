package SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int employee_number, worked_hours;
        double value_per_hour, salary;
        employee_number = sc.nextInt();
        worked_hours = sc.nextInt();
        value_per_hour = sc.nextDouble();
        salary = value_per_hour * worked_hours;

        System.out.println("NUMBER = " + employee_number);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        sc.close();
    }
}
