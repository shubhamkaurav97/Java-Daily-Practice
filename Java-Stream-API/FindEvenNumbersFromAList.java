import java.util.*;
import java.util.stream.*;

public class FindEvenNumbersFromAList{

     public static void main(String []args){
         
         List<Integer> intArr = Arrays.asList(1,3,5,6,9);
         
         List<Integer> listArr = new ArrayList<>();
         
         listArr = intArr.stream().filter(x-> x%2==0).collect(Collectors.toList());
         
         System.out.println(listArr);
     }
}
