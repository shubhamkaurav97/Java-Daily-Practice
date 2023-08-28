import java.util.*;

public class FirstNonRepeatingCharacterInAString{

     public static void main(String []args){
        String s = "leetcode";
      
      HashMap<Character, Integer> strH =  new HashMap<>();
      
      for(int i=0;i<s.length();i++){
          Integer c= strH.get(s.charAt(i));
        //   System.out.print(c);
          strH.put(s.charAt(i),(c==null)? 1 : c+1);
      }
      
      int index = -1;
      
      
      for(int i=0;i<s.length();i++)
      {
          if(strH.get(s.charAt(i)) == 1){
              index=i;
              break;
         }
      }
      
      System.out.println(index);
     }
}
