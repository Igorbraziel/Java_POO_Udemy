package MemoryBehavior_Arrays_Lists;

import java.util.Locale;
import java.util.Scanner;

public class Heights {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N, numberWithLess16 = 0;
        String name;
        int age;
        double height, heightAverage = 0, percentage;

        System.out.print("How many people will be typed? ");
        N = sc.nextInt();

        Person[] peopleVector = new Person[N];

        for(int i = 0; i < N; i++){
            sc.nextLine();

            System.out.printf("%dth person data:\n", i + 1);

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Age: ");
            age = sc.nextInt();

            System.out.print("Height: ");
            height = sc.nextDouble();

            peopleVector[i] = new Person(name, age, height);
        }

        for(int i = 0; i < N; i++){
            heightAverage += peopleVector[i].height;
            if(peopleVector[i].lessThanSixteen()){
                numberWithLess16++;
            }
        }

        heightAverage /= N;
        percentage = 100 * numberWithLess16 / N;

        System.out.println();
        System.out.println("Height Average: " + String.format("%.2f", heightAverage));
        System.out.println("People with less than sixteen years percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("People wiht less than sixteen years names:");

        for(int i = 0; i < N; i++){
            if(peopleVector[i].lessThanSixteen()){
                System.out.println(peopleVector[i].name);
            }
        }

        sc.close();
    }

}