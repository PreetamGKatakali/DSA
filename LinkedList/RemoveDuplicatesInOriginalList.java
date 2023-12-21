package LinkedList;

public class RemoveDuplicatesInOriginalList {
    public static void main(String[] args) {
        LL.addlast(2);
        LL.addlast(2);
        LL.addlast(4);
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
