public class FindSecondLargestElementInAnArray {

    public static void main(String []args) {
        int arr[]= {11,72,32,25,62};

        int length = arr.length;

        int max = arr[0];
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i<length; i++) {

            if(max<arr[i]) {
                max2= max;
                max=arr[i];
            } else if(arr[i]< max && max2 < arr[i]) {
                max2=arr[i];
            }
        }

        System.out.println(max+" "+ max2);
    }
}
