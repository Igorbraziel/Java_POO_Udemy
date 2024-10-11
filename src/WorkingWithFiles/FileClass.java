package WorkingWithFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args){
        String fileName = "SequentialStructure/Exercise1.java";
        File file = new File(fileName);
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch(IOException error) {
            System.out.println("Error: " + error.getMessage());
        } finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}
