import java.util.*;
import java.util.stream.*;
public class UseReduceToSumIntegers {

    public static void main(String []args) {
        ArrayList <Integer> arrL = new ArrayList<>(Arrays.asList(1,2,3,4,2,34,55,1,88,125,55,34,88));
    
        int sum = arrL.stream().reduce(0,(a,b)-> a+b);
        
        System.out.println(sum);
    
    }
}
