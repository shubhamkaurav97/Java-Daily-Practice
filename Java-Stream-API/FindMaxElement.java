// Given a list of integers, find the maximum value element present in it using Stream functions?

import java.util.*;
import java.util.stream.*;

public class FindMaxElement {
    public static void main(String args[]) {
      
        List <Integer> eleList =  Arrays.asList(10,15,8,49,25,98,98,32,15);
        
        int maxElement = eleList.stream().max(Integer::compare).get();
        
        System.out.println(maxElement);
    }
}
