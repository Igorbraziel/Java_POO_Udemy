package Enumerations_Compositions.Exercise1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        String departmentName, workerName, level, dateString, day = "", month = "", year = "";
        Double baseSalary, valuePerHour;
        Integer contractsNumber, hoursDuration;

        Worker worker;

        Pattern datePattern = Pattern.compile("(\\d\\d)?\\/?(\\d\\d)\\/(\\d\\d\\d\\d)"); 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        departmentName = sc.nextLine();

        System.out.println("Enter Worker data: ");

        System.out.print("Name: ");
        workerName = sc.nextLine();

        System.out.print("Level: ");
        level = sc.nextLine();

        System.out.print("Base Salary: ");
        baseSalary = sc.nextDouble();

        worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        contractsNumber = sc.nextInt();

        for(int i = 0; i < contractsNumber; i++){
            System.out.printf("Enter contract #%d data:\n", i + 1);
        
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            dateString = sc.nextLine();

            System.out.print("Value per hour: ");
            valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            hoursDuration = sc.nextInt();

            Matcher dateMatcher = datePattern.matcher(dateString);

            if(dateMatcher.find()){
                day = dateMatcher.group(1);
                month = dateMatcher.group(2);
                year = dateMatcher.group(3);
            }

            LocalDate localDate = LocalDate.parse(String.format("%s-%s-%s", year, month, day));

            HourContract hourContract = new HourContract(localDate, valuePerHour, hoursDuration);

            worker.addContract(hourContract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYY): ");
        sc.nextLine();
        dateString = sc.nextLine();

        Matcher dateMatcher = datePattern.matcher(dateString);
        if(dateMatcher.find()){
            month = dateMatcher.group(2);
            year = dateMatcher.group(3);
        }

        System.out.println("Name: " + worker.name);
        System.out.println("Department: " + worker.department.name);
        System.out.println("Income for " + dateString + ": " + worker.income(Integer.parseInt(year), Integer.parseInt(month)));

        sc.close();
    }
}
