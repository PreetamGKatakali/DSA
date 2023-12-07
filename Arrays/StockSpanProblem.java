import java.util.Arrays;
/**
 * this is about the stockspanproblem where 
 * we have to make the problem as that how many dayes or times the prices has been reduced 
 * for this i.e-->
 * frist res[0]=1;
 * j=i-1 and prices[i]>=prices[j]
 * res[i]++; --> where we will get the number of the reduces has made 
 * 
 */
public class StockSpanProblem {
    static int[] calclate(int[] arr,int n){
        int[] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=1;
            for(int j=i-1;(j>=0 && arr[i]>=arr[j]);j--){
                res[i]++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int[] res=calclate(arr,arr.length);
        System.out.println(Arrays.toString(res));
    }
}
