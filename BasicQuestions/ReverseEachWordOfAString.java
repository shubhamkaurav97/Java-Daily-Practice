public class ReverseEachWordOfAString {

    public static void main(String []args) {
        String s = "This is string";

        String n="";

        for(int i=s.length()-1; i>=0; i--) {
            n=n+s.charAt(i);
        }

        String q[] = n.split(" ");

        String x="";

        for(int i= q.length-1; i>=0; i--) {
            x=x+q[i]+" ";
        }

        System.out.println(x);
    }
}
