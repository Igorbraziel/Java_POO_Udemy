package Inheritance_Polymorphism.FixationExercise2;

public class LegalPerson extends Person {
    public Integer employeesNumber;

    public LegalPerson(String name, Double annualIncome, Integer employeesNumber){
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Double taxValue(){
        Double tax = 0.0;
        if(this.employeesNumber > 10){
            tax += 0.14 * this.annualIncome;
        } else {
            tax += 0.16 * this.annualIncome;
        }

        return tax;
    }
}
