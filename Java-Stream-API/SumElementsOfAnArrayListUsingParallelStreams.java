/* Online Java Compiler and Editor */
import java.util.*;

public class SumElementsOfAnArrayListUsingParallelStreams {

    public static void main(String []args) {
        ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(22,12,11,85,62,90,54));
        
        int sum = arrL.parallelStream().reduce(0,Integer::sum);

        System.out.println(sum);
    }
}
