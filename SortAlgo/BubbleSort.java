package SortAlgo;
import java.util.Arrays;
/**
 * This is program of the bubble sort where the largest element is push at the end.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={7,8,5,46,2,1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
