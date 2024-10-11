package Inheritance_Polymorphism.Exercise1;

public class OutsourcedEmployee extends Employee {
    public Double additionalCharge;
    
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + 1.1 * this.additionalCharge;  
    }
}
