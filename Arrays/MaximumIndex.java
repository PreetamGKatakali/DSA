/**
 * maximumIndex 
 * i.e-->
 * case 1: arr[i]<=arr[j]
 * case 2: j-i should be maximum 
 */
public class MaximumIndex {
    public static void main(String[] args) {
        int[] arr={6, 5, 4, 3, 2, 1};
        int res=0;
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                if(arr[i]<=arr[j]){
                    res=Math.max(j-i, res);
                }
            }
        }
        System.out.println(res);
    }
}
