package SearchAlgo;
/**
 * BinarySearch Algo 
 * to reduce the time complexcity of the liner search O(n)
 */
public class BinarySearch {
    static int Binary(int[] arr,int x){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;   
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
          return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,5,8,9,11,16,17};    
        int x=16;
        int res=Binary(arr, x);
        System.out.println((res!=-1)?"The Element is at index :"+res:"The is not found");

    }
}
