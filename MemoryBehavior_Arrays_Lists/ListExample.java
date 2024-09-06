package MemoryBehavior_Arrays_Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Igor");
        list.add("Nine");
        list.add("Isabela");
        list.add("Ronaldo");
        list.add("Ledinha");
        list.add("Reginaldo");
        list.add("Renilda");
        list.add("Reis");
        list.add("Ruze");
        list.add("Iraides");
        list.add(3, "Tonin");
        list.remove("Reis");
        list.remove(4);

        List<String> namesWithR = list.stream().filter(name -> name.charAt(0) == 'R').collect(Collectors.toList());
        
        for(String name : namesWithR){
            System.out.println(name);
        }

        System.out.println("-----------------");

        for(String name : list){
            System.out.println(name);
        }

        list.removeIf(name -> name.charAt(name.length() - 1) == 'a'); // remove strings with last digit 'a'
        System.out.println("-----------------");
        for(String name : list){
            System.out.println(name);
        }

        list.add(0, "Irineu");

        String name = list.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);

        System.out.println(name);

    }

}