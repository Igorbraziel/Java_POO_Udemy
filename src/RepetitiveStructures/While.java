package RepetitiveStructures;

import java.util.Scanner;

public class While {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value, sum = 0;
        value = sc.nextInt();
        sum += value;
        while(value != 0){
            value = sc.nextInt();
            sum += value;
        }
        System.out.println(sum);
        sc.close();
    }
}
