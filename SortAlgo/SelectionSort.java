package SortAlgo;
import java.util.Arrays;
/**
 * This is selections sort
 * first we are taking the min_index nothing but the first element from the array as smaller 
 * and we are comparing with others and if it is smalle then make it as min_index. 
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,8,9,4,5,2,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
