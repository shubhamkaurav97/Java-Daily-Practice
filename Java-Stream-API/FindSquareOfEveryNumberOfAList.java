import java.util.*;

public class FindSquareOfEveryNumberOfAList {
    public static void main(String args[]) {
      List<Integer> intArr = Arrays.asList(1,3,5,6,9);
         
      intArr.stream().map(x-> x*x).forEach(x->System.out.println(x));
         
        
    }
}
