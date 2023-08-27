import java.util.*;
import java.util.stream.*;
public class AnyMatchWithString {

    public static void main(String []args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        
        String check = "ana";
        
        boolean val =strings.stream().anyMatch(s-> s.contains(check));
        
        System.out.println(val);
    
    }
}
