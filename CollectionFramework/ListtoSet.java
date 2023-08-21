// Write a program to get distinct values present in a List using Set Interface.

import java.util.*;
import java.util.stream.*;

public class ListtoSet {
    public static void main(String args[]) {
        List <Integer> eleList =  Arrays.asList(10,15,8,49,25,98,98,32,15);
        
        Set <Integer> eleSet = new HashSet<>();
        
        for(Integer s : eleList){
            eleSet.add(s);
        }
        
        System.out.println(eleSet);
    }
}
