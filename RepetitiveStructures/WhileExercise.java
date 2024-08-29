package RepetitiveStructures;

import java.util.Scanner;

public class WhileExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int alcohol_number = 0, gasoline_number = 0, diesel_number = 0;
        int x;

        x = sc.nextInt();

        while(x != 4){
            switch(x){
                case 1:
                    alcohol_number++;
                    break;
                case 2:
                    gasoline_number++;
                    break;
                case 3:
                    diesel_number++;
                    break;
                default:
                    break;
            }
            x = sc.nextInt();
        }

        System.out.println("THANK YOU!");
        System.out.println("Alcohol: " + alcohol_number);
        System.out.println("Gasoline: " + gasoline_number);
        System.out.println("Diesel: " + diesel_number);

        sc.close();
    }
}
