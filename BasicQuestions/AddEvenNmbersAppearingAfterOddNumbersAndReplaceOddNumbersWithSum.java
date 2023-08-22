import java.util.*;

public class AddEvenNmbersAppearingAfterOddNumbersAndReplaceOddNumbersWithSum {

    public static void main(String []args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==1) {
                arr[i]=sum;
                sum=0;
            } else {
                sum+=arr[i];
            }
        }


        for(int n : arr) {
            System.out.println(n);
        }
    }
}
