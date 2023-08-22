public class ReverseGivenCharArrayWithoutReversingSpecialCharacter {

    public static void main(String []args) {
        String input = "a,b$cde!fg";

        char [] charArray = input.toCharArray();

        int left=0;
        int right = charArray.length-1;

        while(left<right) {
            if(!isAlphabet(charArray[left])) {
                left++;
            } else if(!isAlphabet(charArray[right])) {
                right--;
            } else {
                char temp=' ';
                temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }

        }

        System.out.println(new String(charArray));

    }

    private static boolean isAlphabet(char c) {
        if((c >='a' && c<='z') || (c>='A' && c<='Z')) {
            return true;
        } else {
            return false;
        }
    }
}
