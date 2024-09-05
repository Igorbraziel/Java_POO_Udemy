package MemoryBehavior_Arrays_Lists;

public class Person {
    public String name;
    public int age;
    public double height;

    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean lessThanSixteen(){
        if(this.age < 16) {
            return true;
        } else {
            return false;
        }
    }
}