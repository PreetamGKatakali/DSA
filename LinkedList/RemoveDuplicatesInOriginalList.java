package LinkedList;
/**
 * This is also a removeing the duplicates from the linkedlist 
 * 
 * But we are perfroming the all the operstion in the single linked list
 * 
 * worst case : if we add the the linked list in the manner like in the way are : 
 *              2-->4-->2-->5-->null
 * we will get the output as same because this program is ment for the checking the neighbour element 
 * are same or not.
 */
public class RemoveDuplicatesInOriginalList {
    public static void main(String[] args) {
        LL.addlast(2);
        LL.addlast(4);
        LL.addlast(2);
        LL.addlast(5);
        Node head=LL.head;

        Node cur=head;
        Node nextcur=head.next;
        while(nextcur!=null){
            if(cur.data==nextcur.data){
                cur.next=nextcur.next;
            }
            else{
                cur=cur.next;
            }
            nextcur=nextcur.next;
            
        }

        LL.displayByHead(head);
    }
}
