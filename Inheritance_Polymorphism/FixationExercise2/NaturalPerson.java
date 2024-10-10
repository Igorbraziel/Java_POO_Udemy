package Inheritance_Polymorphism.FixationExercise2;

public class NaturalPerson extends Person {
    public Double healthySpending;

    public NaturalPerson(String name, Double annualIncome, Double healthySpending){
        super(name, annualIncome);
        this.healthySpending = healthySpending;
    }

    public Double taxValue(){
        Double tax = 0.0;
        if(this.annualIncome < 20000){
            tax += 0.15 * this.annualIncome;
        } else {
            tax += 0.25 * this.annualIncome;
        }

        if(this.healthySpending != 0){
            tax -= 0.5 * this.healthySpending;
        }

        return tax;
    }
}
