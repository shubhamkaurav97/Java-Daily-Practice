import java.util.*;

public class MaximumConsecutiveRepeatingCharinCharacterArray {

    public static void main(String []args) {
        char[] charArray = {'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'a', 'a', 'a'};

        char maxChar= charArray[0];
        int maxCount= 1;
        int currCount= 1;

        for(int i=1; i<charArray.length; i++) {
            if(charArray[i]==charArray[i-1]) {
                currCount++;
                if(currCount>maxCount) {
                    maxCount=currCount;
                    maxChar=charArray[i];
                }
            } else {
                currCount=1;
            }


        }
        System.out.println("Character most consecutive times is " + maxChar + " its count is "+ maxCount);

    }
}
