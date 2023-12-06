/**
 * finding the maxsubarray in the given array 
 * i.e-->
 * here we are having the two variables max_so_for and max_current 
 * where max_so_for having the max value in it 
 * and max_current having the currentmax_current
 *     if(max_so_for<max_current) --> max_so_for=max_current ;
 *     if(max_current<0) --> max_current=0;
 */
public class LargestSumContiguousSubarray {
    static int maxsubarray(int[] arr,int n){
        int max_so_for=Integer.MIN_VALUE;
        int max_current=0;
        for(int i=0;i<n;i++){
            max_current+=arr[i];
            if(max_so_for<max_current){
                max_so_for=max_current;
            }
            if(max_current<0){
                max_current=0;
            }
        }
        return max_so_for;
    }
    public static void main(String[] args) {
        int[] arr={ -2, -3, 4, -1, -2, 1, 5, -3};
        int res=maxsubarray(arr, arr.length);
        System.out.println(res);


    }
}
