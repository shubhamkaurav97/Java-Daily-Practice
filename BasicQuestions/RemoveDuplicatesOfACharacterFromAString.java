import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesOfACharacterFromAString {

    public static void main(String []args) {
        String s= "banana";

        ArrayList<Character> q = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            if(q.contains(s.charAt(i))) {
                if(s.charAt(i)=='a') {
                    continue;
                } else {
                    q.add(s.charAt(i));
                }
            } else {
                q.add(s.charAt(i));
            }
        }

        String x = q.stream().map(Object::toString).collect(Collectors.joining(""));

        System.out.println(x);
    }
}
