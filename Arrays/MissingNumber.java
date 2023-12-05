import java.util.Arrays;
import java.util.List;
/**
 * finding the missing number 
 * here we have to take it from the zero beucase the formaul is on the whole number 
 * 
 * if in the array there is no whole number the we have to make the n=list.size+1;
 * inorder to consider the whole number length.
 */
public class MissingNumber {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(0,1,2,3,4,6,7,8);
        int n=list.size();
        int totalsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        System.out.println(totalsum-sum);
    }
}
