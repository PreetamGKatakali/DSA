package Recursion;

public class ReverseNumber {
    static int ans=0;
    static int reverseNumber(int num){
        if(num<10 && num>=0){
            ans=ans*10+(num%10);
            return num;
        }
        ans=ans*10+(num%10);
        reverseNumber(num/10);
        return ans;
    }
    public static void main(String[] args) {
        int sum=1234;
        System.out.println(reverseNumber(sum));
    }
}
