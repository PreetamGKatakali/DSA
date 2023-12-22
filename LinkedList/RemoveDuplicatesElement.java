package LinkedList;

import java.util.HashSet;
import java.util.Set;
/**
 * removing the duplicates elements from the linked list 
 * this is done by using the set method where we are checking every element before adding to 
 * the new list 
 * 
 * here we are creating the new list 
 */
public class RemoveDuplicatesElement {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();

        LL.addlast(2);
        LL.addlast(4);
        LL.addlast(2);
        LL.addlast(5);
        Node head=LL.head;    //original array 
        Node cur=head;          //cur of the original array 

        Node temp=new Node(-1); //empty linklist
        Node curtemp=temp;

        while(cur!=null){
            Node point=cur.next;
            if(s.contains(cur.data))
            {
                cur=point;
                continue;
            }
            else{
                s.add(cur.data);
                cur.next=null;
                curtemp.next=cur;
                curtemp=curtemp.next;
            }
            cur=point;
        }

        LL.displayByHead(temp.next);
       
      
        
    }
}
