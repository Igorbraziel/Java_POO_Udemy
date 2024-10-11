package Inheritance_Polymorphism.FixationExercise2;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>();
        int N;
        char flag;

        System.out.print("Enter the number of tax payers: ");
        N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.printf("Tax payer #%d data:\n", i);
            System.out.print("Individual or company (i/c)? ");
            flag = sc.next().charAt(0);
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();

            if(flag == 'i'){
                System.out.print("Health expenditures: ");
                Double healthySpending = sc.nextDouble();
                peopleList.add(new NaturalPerson(name, annualIncome, healthySpending));
            } else {
                System.out.print("Number of employees: ");
                Integer employeesNumber = sc.nextInt();
                peopleList.add(new LegalPerson(name, annualIncome, employeesNumber));
            }
        }

        Double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for(Person p : peopleList){
            System.out.println(p);
            sum += p.taxValue();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
