import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST_Level_Order_Traversal{

	static void levelOrder(Node root){
      //Write your code here
     ArrayList<Node> queue=new ArrayList<Node>();
      queue.add(root);
      System.out.print(root.data);
      Node node;
      int x=0;
      while(queue.size() != x){
          node=queue.get(x);
          if(node != null){
              Node left=node.left;
              Node right=node.right;
              if(left !=null )
              {
              queue.add(left);
              System.out.print(" "+left.data);
              }
              if(right!=null){
                  queue.add(right);
                  System.out.print(" "+right.data);
              }
          }
          x+=1;
      }
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}