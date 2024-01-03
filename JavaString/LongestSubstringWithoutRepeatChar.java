package JavaString;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Substring Without Repeating Characters
 */
public class LongestSubstringWithoutRepeatChar {
    public static void main(String[] args) {
        String str="abcabcbb";
        int n=str.length();
        int maxlength=0;
        int left=0;
        Set<Character> list=new HashSet<>();

        for(int right=0;right<n;right++){
            if(!list.contains(str.charAt(right))){
                list.add(str.charAt(right));
                maxlength=Math.max(maxlength, right-left+1);
            }
            else{
                while(list.contains(str.charAt(right))){
                    list.remove(str.charAt(left));
                    left++;
                }
                list.add(str.charAt(right));
            }
        }

        System.out.println("The maxLength is "+maxlength);
    }
}
