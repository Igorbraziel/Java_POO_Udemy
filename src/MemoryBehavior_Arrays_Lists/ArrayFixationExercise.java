package MemoryBehavior_Arrays_Lists;

import java.util.Scanner;

public class ArrayFixationExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M, N, x;

        System.out.print("Enter the number of rows: ");
        M = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        N = sc.nextInt();
        System.out.println();

        int[][] array = new int[M][N];

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Number x belonging to array: ");
        x = sc.nextInt();

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(array[i][j] == x){
                    System.out.println("Position " + i + "," + j + ":");
                    if(j != 0){
                        System.out.println("Left: " + array[i][j - 1]);
                    }
                    if(i != 0){
                        System.out.println("Up: " + array[i - 1][j]);
                    } 
                    if(j != array[i].length - 1){
                        System.out.println("Right: " + array[i][j + 1]);
                    }
                    if(i != array.length){
                        System.out.println("Down: " + array[i + 1][j]);
                    }
                    System.out.println("-------------------------------");
                }
            }
        }

        sc.close();
    }
}