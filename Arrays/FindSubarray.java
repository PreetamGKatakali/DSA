/**
 * finding the subarray of the given sum number in the tange of the index 
 */
public class FindSubarray {
    static void find(int[] arr,int sum){
        for(int i=0;i<arr.length;i++){
            int currentsum=arr[i];
            if(currentsum==sum){
                System.out.println("sum found "+i);
                return;
            }
            else{
                for(int j=i+1;j<arr.length;j++){
                    currentsum+=arr[j];
                    if(currentsum==sum){
                        System.out.println("sum found"+
                        i+" "+j);
                        return;
                    }

                }
            }
        }
        System.out.println("no  subarray found");
        return;
    }
    public static void main(String[] args) {
        int[] arr={45,2,1,6,79,6,2};
        int sum=7;
        find(arr, sum);
    }
}
