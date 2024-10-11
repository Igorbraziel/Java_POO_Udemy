package SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float A, B, C;
        float triangle_area, circle_area, trapezoid_area, square_area, rectangle_area;

        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        triangle_area = A * C / 2;
        circle_area = (float) (Math.PI * (Math.pow(C, 2)));
        trapezoid_area = (A + B) * C / 2;
        square_area = B * B;
        rectangle_area = A * B;

        System.out.printf("TRIANGLE: %.3f\n", triangle_area);
        System.out.printf("CIRCLE: %.3f\n", circle_area);
        System.out.printf("TRAPEZOID: %.3f\n", trapezoid_area);
        System.out.printf("SQUARE: %.3f\n", square_area);
        System.out.printf("RECTANGLE: %.3f\n", rectangle_area);

        sc.close();
    }
}
