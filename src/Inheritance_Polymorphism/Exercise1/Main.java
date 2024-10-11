package Inheritance_Polymorphism.Exercise1;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeesList = new ArrayList<>();
        Employee employee = null;
        int N;
        char flag;

        System.out.print("Enter the number of employees: ");
        N = sc.nextInt();

        for(int i = 0; i < N; i++){
            System.out.printf("Employee #%d data:\n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            flag = sc.next().charAt(0);
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value Per Hour: ");
            Double valuePerHour = sc.nextDouble();

            if(flag == 'y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
            } else {
                employee = new Employee(name, hours, valuePerHour);
            }
            
            employeesList.add(employee);
        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for(Employee emp : employeesList){
            System.out.print(emp);
        }

        sc.close();
    }
}
