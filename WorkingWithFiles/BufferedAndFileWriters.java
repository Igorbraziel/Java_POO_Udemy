package WorkingWithFiles;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class BufferedAndFileWriters {

    public static void main(String[] args) {
        String filePath = "WorkingWithFiles/example.txt";
        String[] lines = {"First Line", "Second Line", "Third Line"};

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException error){
            error.printStackTrace();
        }
    }
}