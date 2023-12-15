package LinkedList;
/**
 * Deleting the Kth element from the LinkedList 
 */
public class DeleteKthElement {
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(4);
        Node head=LL.head;

        Node cur=head;
        int k=4;
        int count=0;
        while(cur!=null){
            if(count==k-2){
                cur.next=cur.next.next;
                break;
            }
            cur=cur.next;
            count++;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");


    }
}
