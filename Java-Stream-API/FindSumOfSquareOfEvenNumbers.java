import java.util.*;

public class FindSumOfSquareOfEvenNumbers {
    public static void main(String args[]) {
        ArrayList<Integer> arrL = new ArrayList(Arrays.asList(2,8,5,3,13,9));
        
		    int sum = arrL.stream().filter(x->x%2==0).mapToInt(x->x*x).sum();

		    System.out.println(sum);
    }
}
