package FunctionalProgramming_LambdaExpressions.FixationExercise;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        File inputFile = new File("src/FunctionalProgramming_LambdaExpressions/FixationExercise/file.csv");
        List<Employee> employeesList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(inputFile))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                employeesList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter with a salary value: ");
            double value = sc.nextDouble();

            System.out.println("Email of the employees that have the salary higer than 2000.0 :");
            employeesList.stream()
                        .filter(e -> e.getSalary() > value)
                        .map(e -> e.getEmail())
                        .sorted((email, otherEmail) -> email.compareTo(otherEmail))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);

            double salarySum = employeesList.stream()
                                            .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                                            .map(e -> e.getSalary())
                                            .reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of the salaries of the employees that the name begins with the letter 'M': " + salarySum);
        } catch(IOException exception){
            exception.printStackTrace();
        }

        sc.close();
    }
}
