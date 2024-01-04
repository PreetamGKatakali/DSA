package Recursion;

public class HelloWolrd {
    static void display(int n){
        if(n==1){
            System.out.println("hello world");
            return ;
        }
        System.out.println("hello world");
        display(n-1);
    }
    public static void main(String[] args) {
        display(5);
    }
}
