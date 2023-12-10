package SortAlgo;
import java.util.Arrays;
/**
 * This program of the heap sort 
 * step 1 : covert the array to max heap 
 * step 2 : Then apply the heap sorting algo
 * 
 * parent : i/2;
 * left child : 2*i+1;
 * right child : 2*i+2;
 * 
 */
public class HeapSort {
    static void sort(int[] arr,int n){
        for(int i=n/2-1;i>=0;--i){    //this is making the max heap
            heapify(arr,n,i);
        }
        for(int i=n-1;i>=0;--i){     //this is making max heap array to sorted array 
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, 0);
        }
    }
    static void heapify(int[] arr,int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,12,9,5,6,10};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
