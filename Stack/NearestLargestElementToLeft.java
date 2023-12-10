package Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestLargestElementToLeft {
    public static void main(String[] args) {
        int[] arr={3,1,2,4};   // o/p :-1,-1,3,-1 
        List<Integer> list=new ArrayList<>();
        
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(st.empty()){
                list.add(-1);
            }
            else if(!st.empty() && st.peek()>arr[i]){
                list.add(st.peek());
            }
            else if(!st.empty() && st.peek()<=arr[i] ){
                while(!st.empty() && st.peek()<arr[i]){
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
        System.out.println(list);
    }
}
