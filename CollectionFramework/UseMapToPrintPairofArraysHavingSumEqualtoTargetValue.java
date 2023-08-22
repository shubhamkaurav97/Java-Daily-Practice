import java.util.*;

public class UseMapToPrintPairofArraysHavingSumEqualtoTargetValue{

     public static void main(String []args){
        int arr[]={6,5,3,8,9,1,2,4,7};
        int target =  8;
        
        
        Map<Integer,Integer> arrCombo = new HashMap<>();
        
        for(int num : arr){
            int complement = target - num;
            
            if(arrCombo.containsKey(complement)){
                System.out.println(complement+ " "+ num);
            }
            
            arrCombo.put(num, complement);
        }
     }
}
