//Write a program using Stream API to filter the list of elements that are divisible by 3 or 5.

import java.util.*;
import java.util.stream.*;

public class MyClass {
    public static void main(String args[]) {
        ArrayList<Integer> intList =  new ArrayList<>(Arrays.asList(32,92,15,63,85,90,76,82,112));
        
        List<Integer> filteredInt = new ArrayList<>();
        
        filteredInt = intList.stream().filter(x -> (x%3==0) || (x%5==0)).collect(Collectors.toList());
        
        System.out.println(filteredInt);
    }
}
