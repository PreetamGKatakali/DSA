package LinkedList;
/**
 * swaping the two number in the linked list 
 */
public class SwapNodes {
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(4);
        LL.addlast(5);
        
        
        Node dummy=new Node(-1000);
        dummy.next=LL.head;
        Node point=dummy;
        while(point.next!=null && point.next.next!=null ){
            Node swap1=point.next;
            Node swap2=point.next.next;

            swap1.next=swap2.next;
            swap2.next=swap1;

            point.next=swap2;
            point=swap1;
        }
        Node temp=dummy.next;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");


        

        


    }
}
