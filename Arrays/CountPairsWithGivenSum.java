import java.util.Arrays;
import java.util.List;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1, 5, 7, -1, 5);
        int k=6;
        int count=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==k){
                    count++;
                    System.out.println(list.get(i)+"+"+list.get(j));
                }
            }
        }
        System.out.println(count);

    }
}
