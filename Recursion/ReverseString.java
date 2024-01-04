package Recursion;
/**
 * Reverseing the String using the recursion method 
 * base condistion is that when str.length()==1 --> return the letter which is present only.
 */
public class ReverseString {
    static String reveString(String str){
        if(str.length()==1){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1)+reveString(str.substring(0, str.length()-1));
    }
    public static void main(String[] args) {
        String str="Apple is good";
        System.out.println(reveString(str));
        
        
    }
}
