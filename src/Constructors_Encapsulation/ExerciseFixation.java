package Constructors_Encapsulation;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseFixation {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number;
        String name;
        char option;
        double money;
        BankAccount account;

        System.out.print("Enter account number: ");
        number = sc.nextInt();

        System.out.print("Enter account holder: ");
        name = sc.nextLine();
        name = sc.nextLine();

        System.out.print("Is there any initial deposit (y/n)? ");
        option = sc.next().charAt(0);
        
        if(option == 'y'){
            System.out.print("Enter initial deposit value: ");
            money = sc.nextDouble();
            account = new BankAccount(number, name, money);
        } else {
            account = new BankAccount(number, name);
        }

        System.out.println("\nAccount data:");
        System.out.println(account + "\n");

        System.out.print("Enter a deposit value: ");
        money = sc.nextDouble();
        account.accountDeposit(money);

        System.out.println("Updated account data:");
        System.out.println(account + "\n");

        System.out.print("Enter a withdrawal value: ");
        money = sc.nextDouble();
        account.accountWithdrawal(money);

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}