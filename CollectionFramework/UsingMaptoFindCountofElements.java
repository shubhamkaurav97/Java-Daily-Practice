// Write a program to find the count of elements present in a list using Hashmap?

import java.util.*;
import java.util.stream.*;

public class MyClass {
    public static void main(String args[]) {
        List <Integer> eleList =  Arrays.asList(2, 5, 8, 2, 10, 5, 15, 8, 20, 25, 30, 15, 10, 35, 40, 45, 20, 50, 55, 60);
        
        Map <Integer,Integer> eleMap = new HashMap<>();
        
        for(Integer i : eleList){
            Integer j = eleMap.get(i);
            eleMap.put(i, (j==null) ? 1 : j+1);
        }
        
        System.out.println(eleMap);
    }
}
