import java.util.*;
import java.util.stream.*;

public class UseStreamToFindDistinctElements {

    public static void main(String []args) {
        ArrayList <Integer> arrL = new ArrayList<>(Arrays.asList(1,2,3,4,2,34,55,1,88,125,55,34,88));
        
        arrL.stream().distinct().forEach(x->System.out.println(x));
    }
}
