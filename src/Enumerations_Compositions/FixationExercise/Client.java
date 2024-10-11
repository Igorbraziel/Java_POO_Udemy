package Enumerations_Compositions.FixationExercise;

import java.time.LocalDate;

public class Client {
    public String name;
    public String email;
    public LocalDate birthDate;

    public Client(String name, String email, LocalDate birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String toString(){
        return this.name + " (" + this.birthDate.format(Order.dateFormatter) + ") - " + this.email;
    }
}
