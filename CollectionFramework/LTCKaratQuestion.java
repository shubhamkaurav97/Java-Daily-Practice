import java.util.*;

public class LTCKaratQuestion {


    public static void main(String args[]) {


        String[][] products = {
            {"Cheese",          "Dairy"},
            {"Carrots",         "Produce"},
            {"Potatoes",        "Produce"},
            {"Canned Tuna",     "Pantry"},
            {"Romaine Lettuce", "Produce"},
            {"Chocolate Milk",  "Dairy"},
            {"Flour",           "Pantry"},
            {"Iceberg Lettuce", "Produce"},
            {"Coffee",          "Pantry"},
            {"Pasta",           "Pantry"},
            {"Milk",            "Dairy"},
            {"Blueberries",     "Produce"},
            {"Pasta Sauce",     "Pantry"}
        };

        String[] list1 = {"Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots"};
        String[] list2 = {"Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese"};
        String[] list3 = {"Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce"};
        String[] list4 = {"Milk", "Flour", "Chocolate Milk", "Pasta Sauce"};
        String[] list5 = {"Cheese", "Potatoes", "Blueberries", "Canned Tuna"};

        // System.out.println(list1[0]);
        int[] diff = new int[5];

        diff[0]=difference(products,list1);
        diff[1]=difference(products,list2);
        diff[2]=difference(products,list3);
        diff[3]=difference(products,list4);
        diff[4]=difference(products,list5);

        for(int n : diff) {
            System.out.println(n);
        }
    }

    public static int difference (String[][] products, String[] list) {

        int counter=0;
        String str=" ";
        for(int i=0; i<list.length; i++) {

            for(int j=0; j<products.length; j++) {
                // System.out.println(list[i]);
                // System.out.println(products[j][0]);
                if(list[i].equals(products[j][0]) && !str.equals(products[j][1])) {

                    counter++;
                    str=products[j][1];
                    //   System.out.println(counter+"---------"+ str+"-----"+list.length+"-------"+products.length);
                }
            }

        }

        HashSet<String> s= new HashSet<>();

        for(int i=0; i<list.length; i++) {
            for(int j=0; j<products.length; j++) {
                if(list[i].equals(products[j][0])) {
                    // System.out.println(list[i].equals(products[j][0]));
                    s.add(products[j][1]);
                    //   System.out.println(s.size());
                }
            }
        }

        // System.out.println(s.size()+"------------"+counter);

        int result = counter-s.size();


        return result;
    }

}
