package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanProblemStack {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        List<Integer> list=new ArrayList<>();

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.empty()){
                list.add(1);
            }
            else if(arr[i]<st.peek()){
                list.add(1);
            }
            else if(arr[i]>st.peek()){
                int count=1;
                for(int j=st.size()-1;j>=0;j--){
                    if(st.get(j)>arr[i]){
                        break;
                    }
                    count++;
                }
                list.add(count);
            }
            st.push(arr[i]);
        }
        System.out.println(list);
    }
}
