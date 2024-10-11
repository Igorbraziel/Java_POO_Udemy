package IntroductionPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        double note;
        Student student = new Student();
        
        name = sc.nextLine();
        student.name = name;

        note = sc.nextDouble();
        student.note1 = note;
        
        note = sc.nextDouble();
        student.note2 = note;

        note = sc.nextDouble();
        student.note3 = note;

        System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());
        System.out.println(student.studentStatus());
        if(student.studentStatus() == "FAILED"){
            System.out.printf("MISSING %.2f POINTS\n", student.missingPoints());
        }

        sc.close();
    }
}
