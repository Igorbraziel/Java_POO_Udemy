package FunctionalProgramming_LambdaExpressions.SolvedExercise;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        File inputFile = new File("src/FunctionalProgramming_LambdaExpressions/SolvedExercise/file.csv");

        try(BufferedReader br = new BufferedReader(new FileReader(inputFile))){
            List<Product> productsList = new ArrayList<>(); 
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                productsList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double averagePrice = productsList.stream().map(x -> x.getPrice()).reduce(0.0, (x, y) -> x + y) / productsList.size();
            System.out.println("Average price: " + String.format("%.2f", averagePrice));
            
            productsList.stream()
            .filter(p -> p.getPrice() < averagePrice)
            .map(x -> x.getName())
            .sorted((name, otherName) -> -name.compareTo(otherName))
            .collect(Collectors.toList())
            .forEach(System.out::println);

        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}