package MemoryBehavior_Arrays_Lists;

import java.util.Locale;
import java.util.Scanner;

public class BoardingHouse {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N;
        String name;
        String email;
        int chosenRoom;
        Student[] boardingHouse = new Student[10];

        System.out.print("Enter the number of students that will rent the rooms: ");
        N = sc.nextInt();

        for(int i = 0; i < N; i++){
            sc.nextLine();
            System.out.println();
            System.out.printf("Rent #%d:\n", i + 1);
            System.out.print("Student name: ");
            name = sc.nextLine();

            System.out.print("Student email: ");
            email = sc.next();

            System.out.print("Number between (0 - 9) for choose a room: ");
            chosenRoom = sc.nextInt();

            boardingHouse[chosenRoom] = new Student(name, email, chosenRoom);
        }

        System.out.println();
        System.out.println("Busy Rooms:");

        for(int i = 0; i < 10; i++){
            if(boardingHouse[i] != null){
                System.out.println(boardingHouse[i].chosenRoom +
                                ": " + boardingHouse[i].studentName +
                                ", " + boardingHouse[i].studentEmail
                );
            }
        }

        sc.close();
    }

}