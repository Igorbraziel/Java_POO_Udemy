package Generics_Set_Map.MapExercise;

import java.util.Locale;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> electionMap = new HashMap<>();
        String filePath = "src/Generics_Set_Map/MapExercise/file.csv";


        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                if(electionMap.containsKey(fields[0])){
                   electionMap.put(fields[0], electionMap.get(fields[0]) + Integer.parseInt(fields[1])); 
                } else {
                    electionMap.put(fields[0], Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }

            for(String key: electionMap.keySet()){
                System.out.println(key + ": " + electionMap.get(key));
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }


        sc.close();
    }
}
