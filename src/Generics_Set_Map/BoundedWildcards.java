package Generics_Set_Map;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BoundedWildcards {

    public static void copy(List<? extends Number> numbersList, List<? super Number> objectList){
        for(Number number : numbersList){
            objectList.add(number);
        }
    }
    public static void main(String[] args){
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }
    
    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

    //https://stackoverflow.com/questions/1368166/what-is-a-difference-between-super-e-and-extends-e    
}
