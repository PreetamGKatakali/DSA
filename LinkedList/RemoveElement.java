package LinkedList;
/**
 * removing the element in the LinkedList
 */
public class RemoveElement {
    public static void main(String[] args) {
        LL.addlast(20);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);
        LL.addlast(20);
        // Node currenthead=LL.head;
        // Node cur=new Node(0);
        Node currenthead=new Node(0);
        currenthead.next=LL.head;
        Node cur=currenthead;
        while(cur.next!=null){
            if(cur.next.data==20){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        Node temp=currenthead.next;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp= temp.next;
        }
        System.out.print("null");
        


    }
}
