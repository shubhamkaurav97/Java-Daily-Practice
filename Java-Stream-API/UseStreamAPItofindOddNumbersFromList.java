import java.util.*;

public class UseStreamAPItofindOddNumbersFromList {
    public static void main(String args[]) {
      ArrayList <Integer> arrList = new ArrayList<>(Arrays.asList(1,2,4,99,44,33,11));
      
      arrList.stream().filter(x->x%2 !=0).forEach(x->System.out.println(x));
    }
}
