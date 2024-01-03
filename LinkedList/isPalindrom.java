package LinkedList;
/**
 * This program is weather to check the given linke list is palindrom or not 
 * 
 * step 1: Take the middle element from the linkedlist 
 * step 2: And covert that middle of the linkedlist to the revese format 
 * step 3: And the comapre with the head of the element.
 * Note : The while condistion will be the (slow!=null) 
 * 
 */
public class isPalindrom {
    static Node reverse(Node head){
        Node pervNode=null;
        while(head!=null){
            Node temp=head.next;
            head.next=pervNode;
            pervNode=head;
            head=temp;
        }
        return pervNode;
    }

    static boolean isPalindromList(Node fast,Node slow){
        while(slow!=null){
            if(fast.data!=slow.data){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;

    }
    
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(1);

        Node head=LL.head;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

         slow=reverse(slow);
         fast=head;

         System.out.println(isPalindromList(fast, slow));


        // Node perNode=slow;
        // slow=slow.next;
        // perNode.next=null;
        // while(slow!=null){
        //     Node temp=slow.next;
        //     slow.next=perNode;
        //     perNode=slow;
        //     slow=temp;
        // }
        
        // LL.displayByHead(head);


      

        
    }
}
