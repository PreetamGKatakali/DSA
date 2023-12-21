package LinkedList;
/**
 * Last but not the one 
 * i.e-> we are removeing the last element from the linkedlist 
 *        condistion :- so we use list.next != null
 */
public class LastButOne {
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);
        LL.addlast(50);
        Node list=LL.head;
        // LL.displayByHead(list);
        while (list.next!=null) {
            System.out.print(list.data+" ");
            list=list.next;
        }
    }
}
