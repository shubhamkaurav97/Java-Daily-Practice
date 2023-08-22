import java.util.*;

public class PrintPairofNumbersInAnArrayHavingSumEqualtoTargetNumber{

     public static void main(String []args){
        int arr[]={6,5,3,8,9,1,2,4,7};
        int target =  8;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        

     }
}
