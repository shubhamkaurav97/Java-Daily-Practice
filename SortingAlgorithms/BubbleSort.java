public class BubbleSort {
    public static void main(String args[]) {
        Double a[] = {4.0,5.0,6.0,-1.0,-82.0,0.0,-4.5};
        
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i] > a[j]){
                    Double temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        for(Double d:a){
            System.out.println(d);
        }
    }
}
