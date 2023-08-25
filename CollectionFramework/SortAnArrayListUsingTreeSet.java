import java.util.*;

public class SortAnArrayListUsingTreeSet {
    public static void main(String args[]) {
        ArrayList<Double> arrL = new ArrayList<Double>(Arrays.asList(4.0,5.0,6.0,-1.0,-82.0,0.0,-4.5));
        
        TreeSet<Double> treeSet = new TreeSet<Double>();
        
        treeSet.addAll(arrL);
        
        int n = treeSet.size();
        
        System.out.println(treeSet);
    }
}
