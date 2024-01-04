package Recursion;

public class factorial {
    static int fact(int n){
        if(n==1){
            return 1;
        }
        int temp=fact(n-1);
        int res=n*temp;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
