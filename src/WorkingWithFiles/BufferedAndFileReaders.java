package WorkingWithFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedAndFileReaders {
    public static void main(String[] args){
        String filePath = "WorkingWithFiles/FileClass.java";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch(IOException error){
            System.out.println("Error: " + error.getMessage());
        }
    }
}
