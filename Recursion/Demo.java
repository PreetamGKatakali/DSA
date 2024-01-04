package Recursion;

public class Demo {
    static void display(int num){
        if(num==0){
            return;
        }
        display(num-1);
        System.out.println(num);

    }
    public static void main(String[] args) {
        display(5);
    }
}
