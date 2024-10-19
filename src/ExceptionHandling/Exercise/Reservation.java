package ExceptionHandling.Exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Reservation {
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException {
        if(Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay()).toDays() < 0){
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public void setRoomNumber(Integer roomNumber){
        this.roomNumber = roomNumber;
    }

    public Integer getRoomNumber(){
        return roomNumber;
    }

    public LocalDate getCheckin(){
        return checkin;
    }

    public LocalDate getCheckout(){
        return checkout;
    }

    public int duration(){
        LocalDateTime checkinDateTime = checkin.atStartOfDay();
        LocalDateTime checkoutDateTime = checkout.atStartOfDay();
        return (int) Duration.between(checkinDateTime, checkoutDateTime).toDays();
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException {
        if(Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay()).toDays() < 0){
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        } else if(Duration.between(this.checkin.atStartOfDay(), checkin.atStartOfDay()).toDays() < 0){
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
        } else if(Duration.between(this.checkout.atStartOfDay(), checkout.atStartOfDay()).toDays() < 0){
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
        }

        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString(){
        return "Reservation: Room " + roomNumber + ", check-in: " + checkin.format(Reservation.dateFormatter)
        + ", check-out: " + checkout.format(Reservation.dateFormatter) + ", " + this.duration() + " nigths"; 
    }
}
