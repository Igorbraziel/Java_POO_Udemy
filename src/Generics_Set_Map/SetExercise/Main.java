package Generics_Set_Map.SetExercise;

import java.util.Locale;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LogRegister logRegister = new LogRegister();
        String filePath = "src/Generics_Set_Map/SetExercise/file.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(" ");
                logRegister.login(new User(fields[0], Instant.parse(fields[1])));
                line = br.readLine();
            }
        } catch(IOException exception){
            exception.printStackTrace();
        }

        System.out.println("Total users: " + logRegister.userSetSize());

        sc.close();
    }
}
