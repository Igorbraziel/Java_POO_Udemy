package Interfaces.Exercise1;

import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rental data:");

        System.out.print("Car model: ");
        String carModel = sc.nextLine();

        System.out.print("Removal: (dd/MM/yyyy HH:mm): ");
        LocalDateTime rentalStart = LocalDateTime.parse(sc.nextLine(), CarRental.dateFormatter);

        System.out.print("Return: (dd/MM/yyyy HH:mm): ");
        LocalDateTime rentalFinish = LocalDateTime.parse(sc.nextLine(), CarRental.dateFormatter);

        System.out.print("Enter the hour price: ");
        double hourPrice = sc.nextDouble();

        System.out.print("Enter the day price: ");
        double dayPrice = sc.nextDouble();

        RentalService rentalService = new RentalService(hourPrice, dayPrice, new BrazilTaxService());

        CarRental carRental = new CarRental(rentalStart, rentalFinish, new Vehicle(carModel));

        rentalService.processInvoice(carRental);

        System.out.println();
        System.out.println("INVOICE:");
        System.out.println(carRental.getInvoice());

        sc.close();
    }
}
