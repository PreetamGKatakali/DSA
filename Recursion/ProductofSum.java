package Recursion;

public class ProductofSum {
    static int productOfSum(int n){
        if(n==0){
            return 1;
        }
        return (n%10) * productOfSum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(productOfSum(1324));
    }
}
