/**
 * this is the finding the maxproductsum 
 * in the given array 
 */
public class MaximumProductSubarray {
    static int maxProductSubarray(int[] arr,int n){
        int result=arr[0];
        for(int i=0;i<n;i++){
            int mul=arr[i];
            for(int j=i+1;j<n;j++){
                result=Math.max(result, mul);
                mul*=arr[j];
            }
            result=Math.max(result, mul);

        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={6, -3, -10, 0, 2};
        int res=maxProductSubarray(arr,arr.length);
        System.out.println(res);
    }
}
