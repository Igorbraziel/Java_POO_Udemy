package MemoryBehavior_Arrays_Lists;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ListsProposedExercise {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeesList = new ArrayList<>();
        int N, id, employeeId, luckyEmployeeIndex;
        String name;
        double salary, percentage;

        System.out.print("How many employees will be registered? ");
        N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.println();
            System.out.println("Employee #" + i + ":");

            System.out.print("Id: ");
            id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();

            System.out.print("Salary: ");
            salary = sc.nextDouble();
            
            Employee employee = new Employee(id, name, salary);

            employeesList.add(employee);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have a salary increase: ");
        employeeId = sc.nextInt();

        Employee luckyEmployee = employeesList.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);

        if(luckyEmployee != null){
            System.out.print("Enter the percentage: ");
            percentage = sc.nextDouble();
            luckyEmployeeIndex = employeesList.indexOf(luckyEmployee);
            luckyEmployee.increaseSalary(percentage);

            employeesList.remove(luckyEmployeeIndex);
            employeesList.add(luckyEmployeeIndex, luckyEmployee);
        } else {
            System.out.println("This id does not exists!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for(Employee employee : employeesList){
            System.out.println(employee);
        }

        sc.close();
    }

}
