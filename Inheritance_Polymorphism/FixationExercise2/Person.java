package Inheritance_Polymorphism.FixationExercise2;

public abstract class Person {
    public String name;
    public Double annualIncome;

    public Person(String name, Double annualIncome){
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract Double taxValue();

    public String toString(){
        return this.name + ": $ " + String.format("%.2f", this.taxValue());
    }
}
