package SortAlgo;
import java.util.Arrays;
/**
 * This is program of the insertions sort 
 * where the min element is in the frist index 
 */
public class insertionSort {
    public static void main(String[] args) {
        int[] arr={7,8,9,10,1,2};
        int n=arr.length;
        for(int i=1;i<n;++i){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
