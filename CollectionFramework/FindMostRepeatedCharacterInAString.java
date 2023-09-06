import java.util.*;

public class FindMostRepeatedCharacter {
    public static void main(String args[]) {
      String str = "I am a Solution Analyst";
        
        HashMap<Character,Integer> charMap = new HashMap<>();
        
        str=str.toLowerCase();
        
        
        for(char x : str.toCharArray()){
            if(x !=' '){
                Integer c=charMap.get(x);
                charMap.put(x,(c==null) ? 1: c+1);
            }
        }
        
        int maxCount=0;
        char mostRepeatedChar = '\0';
        
        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            if(entry.getValue()>maxCount)
            {
                maxCount =  entry.getValue();
                mostRepeatedChar =  entry.getKey();
            }
        }
        System.out.println("Most Repeated character in the String is: "+ mostRepeatedChar + " and its count is: "+ maxCount);
    }
}
