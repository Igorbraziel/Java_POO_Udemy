package Enumerations_Compositions.Exercise1;

import java.time.LocalDate;

public class HourContract {
    public LocalDate date;
    public Double valuePerHour;
    public Integer hours;

    public HourContract(LocalDate date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue(){
        return valuePerHour * hours;
    }

}
