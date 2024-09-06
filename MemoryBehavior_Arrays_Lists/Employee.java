package MemoryBehavior_Arrays_Lists;

public class Employee {
    private int id;
    public String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public void increaseSalary(double percentage){
        salary += (percentage / 100.0)  * salary;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
