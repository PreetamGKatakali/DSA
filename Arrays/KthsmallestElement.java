import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * finding the kth smallest or the biggest ion the array 
 * case 1: where we have duplicates value in the array 
 *         for this we have to remove the duplicates from the array 
 */
public class KthsmallestElement {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(
            1,2,2,3,4,5,6,7
        );
       
        /**
         * this is not possible in the worst case becuase we are get the output as the 
         * 2 where we should get 3 .
         */

         List<Integer> res=new ArrayList<>();
         for(int i=0;i<list.size();i++){
            int j=i-1;
            for(;j>=0;j--){
                if(list.get(i)==list.get(j)){
                    break;
                }
            }
            if(j==-1){
               res.add(list.get(i));
            }
         }
         System.out.println(res.get(3-1));
    }
}
