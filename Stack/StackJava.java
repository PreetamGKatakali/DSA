package Stack;

public class StackJava {
    static final int MAX=5;
    static int top=-1;
    static int a[]=new int[MAX];
    // StackJava(){     /**this can be enable while creating the object */
    //     top=-1;
    // }
    static void push(int x){
        if(top>=(MAX-1)){
            System.out.println("stack overflow");
        }
        else{
            a[++top]=x;
            System.out.println(x+" is pushed to the stack");
        }
    }
    static void pop(){
        if(top<0){
            System.out.println("stack is underflow");
        }
        else{
            int val=a[top--];
            System.out.println(val+" is poped out from the stack");
        }
    }
    static void peek(){
        if(top<0){
            System.out.println("the stack is underflow");
        }
        else{
            int val=a[top];
            System.out.println(val+" is the peek element in the stack");
        }
    }
    static void display(){
        for(int i=top;i>-1;i--){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        peek();
        display();


    }
}
