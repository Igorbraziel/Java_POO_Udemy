package Interfaces.Exercise1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarRental {
    public static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private LocalDateTime rentalStart;
    private LocalDateTime rentalFinish;
    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(LocalDateTime rentalStart, LocalDateTime rentalFinish, Vehicle vehicle) {
        this.rentalStart = rentalStart;
        this.rentalFinish = rentalFinish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getRentalStart() {
        return rentalStart;
    }

    public void setRentalStart(LocalDateTime rentalStart) {
        this.rentalStart = rentalStart;
    }

    public LocalDateTime getRentalFinish() {
        return rentalFinish;
    }

    public void setRentalFinish(LocalDateTime rentalFinish) {
        this.rentalFinish = rentalFinish;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Invoice getInvoice(){
        return invoice;
    }

    public void setInvoice(Invoice invoice){
        this.invoice = invoice;
    }

}
