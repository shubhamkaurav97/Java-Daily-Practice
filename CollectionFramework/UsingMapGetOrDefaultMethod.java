import java.util.*;
import java.util.stream.*;

public class UsingMapGetOrDefaultMethod {
    public static void main(String args[]) {
      String s = "This is String";
      
      HashMap<Character, Integer> m = new HashMap<>();
      
      for(char c : s.toCharArray()){
          if(c !=' '){
               m.put(c,m.getOrDefault(c,0)+1);
          }
      }
      
      for(Map.Entry<Character,Integer> e : m.entrySet())
      System.out.println("This character "+ e.getKey()+" occurs "+ e.getValue() + " times in string.");
    }
}
