import java.util.*;
import java.util.stream.*;

public class ReverseEachWordOfAStringUsingStreamAPI {
    public static void main(String args[]) {
      String s = "This is string";
      
      String result = Arrays.asList(s.split(" ")).stream().map(q-> new StringBuilder(q).reverse()).collect(Collectors.joining(" "));
      
      System.out.println(result);
    }
}
