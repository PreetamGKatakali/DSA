package LinkedList;
/**
 * 1->2->3->4->5 
 * 
 * 
 */
public class reverseLinkedListMiddle {
    static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(4);
        LL.addlast(5);   // o/p : 1->4->3->2->5
        int left =2;
        int right=3;
        //case frist : l<=r
        
        Node head=LL.head;
        Node dummy=new Node(-1000);
        dummy.next=head;
        Node prev=dummy;    //-1000->1->2->3-4->5

        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }

        Node cur=prev.next;
        for(int i=0;i<(right-left);i++){   
            Node frow=cur.next;
            cur.next=frow.next;
            frow.next=prev.next;
            prev.next=frow;
        }

        display(dummy.next);

    



                              
    }
}
