package MemoryBehavior_Arrays_Lists;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, negativeNumbers = 0;
        N = sc.nextInt();
        int[][] matriz = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal:");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i == j){
                    System.out.print(matriz[i][j] + " ");
                }
                if(matriz[i][j] < 0) negativeNumbers++;
            }
        }

        System.out.println();
        System.out.println("Negative Numbers = " + negativeNumbers);

        sc.close();
    }
}
