package RepetitiveStructures;

import java.util.Scanner;

public class For {
    public static void main(String[] args){
        int N, i, x, sum = 0;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for(i = 0; i < N; i++){
            x = sc.nextInt();
            sum += x;
        }

        System.out.println(sum);
        sc.close();
    }
}
