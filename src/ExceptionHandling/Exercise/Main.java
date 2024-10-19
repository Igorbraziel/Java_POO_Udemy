package ExceptionHandling.Exercise;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Room Number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkinDate = LocalDate.parse(sc.next(), Reservation.dateFormatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkoutDate = LocalDate.parse(sc.next(), Reservation.dateFormatter);
            
            Reservation reservation = new Reservation(roomNumber, checkinDate, checkoutDate);

            System.out.println(reservation);

            System.out.println();

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate newCheckinDate = LocalDate.parse(sc.next(), Reservation.dateFormatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate newCheckoutDate = LocalDate.parse(sc.next(), Reservation.dateFormatter);
            
            reservation.updateDates(newCheckinDate, newCheckoutDate);

            System.out.println(reservation);

        } catch (DomainException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            if(sc != null){
                sc.close();
            }
        }

    }
}
