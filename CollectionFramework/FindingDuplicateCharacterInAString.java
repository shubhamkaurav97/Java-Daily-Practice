import java.util.*;

public class FindingDuplicateCharacterInAString{

     public static void main(String []args){
        String s= "Shubham";

        HashMap<Character, Integer> hashM = new HashMap<>();
        ArrayList<Character> arr = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' ') {
                Integer c = hashM.get(s.charAt(i));
                hashM.put(s.charAt(i),(c==null)?1:c+1);
            }
        }

        for(Map.Entry<Character,Integer> entry : hashM.entrySet()) {
            if(entry.getValue()>1) {
                arr.add(entry.getKey());
            }
        }

        for(Character x : arr) {
            System.out.println(x);
        }
     }
}
