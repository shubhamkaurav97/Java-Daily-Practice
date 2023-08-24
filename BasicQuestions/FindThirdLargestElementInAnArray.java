public class FindThirdLargestElementInAnArray {

    public static void main(String []args) {
        int arr[]= {-11,-72,-32,-25,-62};

        int length = arr.length;

        int max = arr[0];
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int i=0; i<length; i++) {

            if(max<arr[i]) {
                max2= max;
                max=arr[i];
            } else if(arr[i]< max && max2 < arr[i]) {
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]< max2 && max3 < arr[i]) {
                max3=arr[i];
            }
        }

        System.out.println(max+" "+ max2+" "+max3);
    }
}
