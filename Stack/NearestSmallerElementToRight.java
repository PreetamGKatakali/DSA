package Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestSmallerElementToRight {
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
        List<Integer> list=new ArrayList<>();

        Stack<Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(st.empty()){
                list.add(-1);
            }
            else if(!st.empty() && st.peek()<arr[i]){
                list.add(st.peek());
            }
            else if(!st.empty() && st.peek()>=arr[i]){
                while(!st.empty() && st.peek()>=arr[i]){
                    st.pop();
                }
                if(st.empty()){
                    list.add(-1);
                }
                else{
                    list.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);

    }
}
