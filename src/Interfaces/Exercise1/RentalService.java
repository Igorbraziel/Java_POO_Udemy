package Interfaces.Exercise1;

import java.time.Duration;

public class RentalService extends BrazilTaxService {
    private Double pricePerHour;
    private Double pricePerDay;

    public RentalService(Double pricePerHour, Double pricePerDay) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice(CarRental carRental){
        Duration duration = Duration.between(carRental.getRentalStart(), carRental.getRentalFinish());
        Double basicPayment;
        long days = duration.toDays();
        long hours = duration.toHours() - days * 24;
        long minutes = duration.toMinutes() - hours * 60;
        if(minutes > 0) hours += 1;
        if(days == 0 && hours <= 12){
            basicPayment = hours * this.getPricePerHour();
        } else if(hours > 0){
            days += 1;
            basicPayment = days * this.getPricePerDay();
        } else {
            basicPayment = days * this.getPricePerDay();
        }

        double tax = this.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
        
}
