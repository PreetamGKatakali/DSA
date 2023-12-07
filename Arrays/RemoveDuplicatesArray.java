import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,45,4,89,9};
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int j=i-1;
            for(;j>=0;j--){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(j==-1){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
