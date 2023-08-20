//Write a program that takes a list of string as input and returns a list of string with all caps letter.(Note : Remember you can only use java 8 features for this program)

import java.util.*;
import java.util.stream.*;

public class MyClass {
    public static void main(String args[]) {
        ArrayList<String> strList =  new ArrayList<>(Arrays.asList("shubham","Kaurav","Nihal","Shukla","Vishesh"));
        
        List capsStr = new ArrayList<>();
        
        capsStr = strList.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        
        System.out.println(capsStr);
    }
}
