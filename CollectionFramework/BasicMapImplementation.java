import java.util.*;

class Solution {
    public static void main(String[] args) {
        Map<String,Integer> mapEle =  new HashMap<>();
        
        mapEle.put("one",1);
        mapEle.put("two",2);
        mapEle.put("three",3);
        mapEle.put("four",4);
        
        for(Map.Entry entry : mapEle.entrySet()){
            System.out.println("Key: "+ entry.getKey()+ " Value: "+ entry.getValue()+" ");
        }
    }
}
