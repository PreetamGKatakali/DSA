package Brackets;

import java.util.Stack;

public class BracketsBalance {
    static boolean Balance(String str){
        Stack<Character> s=new Stack<>();   // "(){}[]"
        char[] res=str.toCharArray();
        for(int i=0;i<res.length;i++){
            if(res[i]=='(' || res[i]=='{' || res[i]=='['){
                s.push(res[i]);
            }
            else{
                if(res[i]==')' && s.peek()=='(' ||
                   res[i]=='}' && s.peek()=='{' ||
                   res[i]==']' && s.peek()=='['){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String str="(){{}}[[]";
        boolean res=Balance(str);
        System.out.println(res);
    }
}
