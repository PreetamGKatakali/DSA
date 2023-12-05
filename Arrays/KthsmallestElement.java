import java.util.Arrays;
/**
 * finding the kth smallest or the biggest ion the array 
 * and we should also find the worest case
 */
public class KthsmallestElement {
    public static void main(String[] args) {
        int[] arr={1,24,5,7,8,9,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[3-1]);
    }
}
