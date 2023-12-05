/**
 * Given an array arr of n elements that is first strictly
 *  increasing and then maybe strictly decreasing, find the maximum element in the array.
 */

public class notsmallerthanitsneighbours {
    static int find(int arr[]){
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0]>=arr[1]){
            return 0;
        }
        if(arr[n-1]>=arr[n-2]){
            return n-1;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1, 3, 20, 4, 1, 0};
        System.out.println(find(arr)); 
    }
}
