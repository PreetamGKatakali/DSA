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
public class BinaryTreeNodes {
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

    static int countNumberOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNode=countNumberOfNodes(root.left);
        int rightNode=countNumberOfNodes(root.right);
        return leftNode+rightNode+1;
    }

    static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNode=sumOfNodes(root.left);
        int right=sumOfNodes(root.right);
        return leftNode+right+root.data;
    }

    static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int left=heightOfTree(root.left);
        int right=heightOfTree(root.right);
        int height=Math.max(left,right)+1;
        return height;
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=binarytree(nodes);
        System.out.println(heightOfTree(root));
    }
}
