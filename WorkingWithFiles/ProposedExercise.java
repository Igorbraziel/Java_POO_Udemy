package WorkingWithFiles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class ProposedExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String strPath;
        String line, name, price, amount;
        List<Item> itens = new ArrayList<>();

        System.out.print(".csv file path: ");
        strPath = sc.next();

        File currentCsvFile = new File(strPath);
        new File(currentCsvFile.getParent() + "/out").mkdir();

        try(BufferedReader br = new BufferedReader(new FileReader(currentCsvFile.getPath()))){
            line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                name = fields[0];
                price = fields[1];
                amount = fields[2];
                itens.add(new Item(name, Double.parseDouble(price), Integer.parseInt(amount)));
                line = br.readLine();
            }
        } catch(IOException error){
            error.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(currentCsvFile.getParent() + "/out" + "/summary.csv"))){
            for(Item item : itens){
                name = item.name;
                price = String.format("%.2f", item.totalValue());
                bw.write(String.format("%s,%s", name, price));
                bw.newLine();
            }
        } catch(IOException error){
            error.printStackTrace();
        }

        sc.close();
    }
}
