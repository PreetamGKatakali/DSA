package LinkedList;
/**
 * This program is weather to check the given linke list is palindrom or not 
 * 
 * here we are coverting the given list to reverse from of the linked list and then check one by one 
 */
public class isPalindrom {
    public static boolean isaPalindrom(Node head ,Node perNode){
        while(head!=null && perNode!=null){
            if(head.data!=perNode.data){
                return false;
            }
            head=head.next;
            perNode=perNode.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(1);

        Node head=LL.head;
        Node cur=head;

        Node perNode=null;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=perNode;
            perNode=cur;
            cur=temp;
        }

        System.out.println(isaPalindrom(head, perNode));
    }
}
