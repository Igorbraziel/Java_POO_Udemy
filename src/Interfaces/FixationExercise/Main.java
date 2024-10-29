package Interfaces.FixationExercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Enterprise enterprise = new Enterprise(new Paypal());

        System.out.println("Enter the contract data:");

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.next(), dateFormatter);

        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();

        System.out.print("Enter the installments number: ");
        int monthsDuration = sc.nextInt();

        Contract contract = new Contract(number, contractDate, contractValue, monthsDuration);

        contract.setMonthsDuration(monthsDuration);

        enterprise.setContract(contract);
        enterprise.contractProcessing();

        for(Installment installment : contract.getInstallmentList()){
            System.out.println(installment);
        }

        sc.close();
    }
}
