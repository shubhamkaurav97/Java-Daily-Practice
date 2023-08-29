import java.util.*;

public class FindNonRepeatingCharacterFromAList {

    public static void main(String []args) {
        ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,5,6));

        HashMap<Integer, Integer> hashM = new HashMap<>();


        for(int i =0; i<arrL.size(); i++) {

            Integer c= hashM.get(arrL.get(i));

            hashM.put(arrL.get(i),(c==null) ? 1 : c+1);
        }

        ArrayList<Integer> a2 = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : hashM.entrySet()) {
            if(entry.getValue()==1) {
                a2.add(entry.getKey());
            }
        }

        System.out.println(a2);
    }
}
