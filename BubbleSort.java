import java.util.Arrays;

public class BubbleSort {
    
    public static void sort_rec(int arr[],int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        sort_rec(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,2,3};
        sort_rec(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
