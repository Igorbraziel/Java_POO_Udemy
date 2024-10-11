package SequentialStructure;
import java.util.Scanner;
import java.util.Locale;

public class Data_input{
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;

        name = sc.next();

        System.out.println("Name: " + name);

        sc.close();
    }

}



