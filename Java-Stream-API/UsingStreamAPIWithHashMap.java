import java.util.*;
import java.util.stream.*;

public class UsingStreamAPIWithHashMap {
    public static void main(String args[]) {
      Map<String, Integer> map = new HashMap<>();
      map.put("one", 1);
      map.put("two", 2);
      map.put("three", 3);
      
      map.keySet().stream().forEach(System.out::println);
      
      System.out.println("-----------------------------------------------------------");
      
      map.values().stream().forEach(x-> System.out.println(x));
      
      System.out.println("-----------------------------------------------------------");

      map.keySet().stream().filter(key->key.startsWith("th")).forEach(x->System.out.println(x));
      
      System.out.println("-----------------------------------------------------------");

      int sum = map.values().stream().mapToInt(Integer::intValue).sum();

      
      System.out.println(sum);
      
      System.out.println("-----------------------------------------------------------");
      
      int reduce = map.values().stream().reduce(0, (subtotal,value)->subtotal+value); 
      
      System.out.println(reduce);
      
    }
}
