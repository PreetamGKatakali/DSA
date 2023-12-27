import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinTree {
    static int index=-1;
    static Node binarytree(int[] nodes){
        ++index;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode=new Node(nodes[index]);
        newNode.left=binarytree(nodes);
        newNode.right=binarytree(nodes);
        return newNode;
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    static void perorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        perorder(root.left);
        perorder(root.right);
    }
    static void levelOrder(Node root){
        if(root==null){
            return;
        }
        int numberOfNodes=0;
        int levels=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curNode=q.remove();
            if(curNode==null){
                levels++;
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curNode.data+" ");
                numberOfNodes++;
                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }
        }
        System.out.println("number of nodes are "+numberOfNodes);
        System.out.println("levels of the tree are "+levels);

    }



    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binarytree(nodes);
        levelOrder(root);
    }
}
