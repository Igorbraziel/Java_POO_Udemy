package Interfaces.FixationExercise;

import java.time.LocalDate;

public class Installment {
    private LocalDate date;
    private double value;

    public Installment(LocalDate date, double value){
        this.date = date;
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return date.format(Main.dateFormatter) + " - " + String.format("%.2f", value);
    }
}
