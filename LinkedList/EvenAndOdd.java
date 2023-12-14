package LinkedList;
/**
 * this is even and odd linked list 
 * printing the even frist and odd last in the linked list 
 * Note : never loos the head in the linked list
 */
public class EvenAndOdd {
    static void display(Node head){
        while(head!=null){
            System.out.print(head.data+"-->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL.addlast(17);
        LL.addlast(15);
        LL.addlast(8);
        LL.addlast(9);
        LL.addlast(2);
        LL.addlast(4);
        LL.addlast(6);
        Node head=LL.head;

        Node evenHead=new Node(-1);
        Node oddHead=new Node(-1);

        Node cureven=evenHead;
        Node curodd=oddHead;

        while(head!=null){
            Node temp=head.next;
            head.next=null;
            if(head.data%2==0){
                cureven.next=head;
                cureven=cureven.next;
            }
            else{
                curodd.next=head;
                curodd=curodd.next;
            }
            head=temp;
        }
        cureven.next=oddHead.next;

        display(evenHead.next);

        
    }
}
