package Inheritance_Polymorphism.Exercise1;

public class Employee {
    public String name;
    public Integer hours;
    public Double valuePerHour;

    public Employee(String name, Integer hours, Double valuePerHour){
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return this.hours * this.valuePerHour;
    }

    public String toString(){
        return this.name + " - $ " + String.format("%.2f", this.payment()) + '\n';
    }
}
