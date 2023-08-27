import java.util.*;
import java.util.stream.*;
public class SkipAndLimitInSteamAPI {

    public static void main(String []args) {
        ArrayList <Integer> arrL = new ArrayList<>(Arrays.asList(1,2,3,4,2,34,55,1,88,125,55,34,88));
        
         System.out.println("Strating 5");
        
        arrL.stream().limit(5).forEach(x->System.out.print(x + " "));
        
        System.out.println(" ");
        System.out.println("Skipped 5");
        
        arrL.stream().skip(5).forEach(x->System.out.print(x+" "));
    }
}
