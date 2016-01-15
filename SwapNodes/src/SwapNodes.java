
	import java.io.*;
	import java.util.*;

	class Node{
	        int data;
	        Node left;
	        Node right;
	        
	        public Node(){
	            data = 0;
	            left = null;
	            right = null;
	        }
	       public Node findNode(Node root, int value){
	            if(root == null)
	                return null;
	           //System.out.println(root.data + " " + value);
	            if(root.data == value)
	                return root;
	            Node tmp1 = findNode(root.right, value);
	            Node tmp2 = findNode(root.left, value);
	           //System.out.println("tmp " + tmp.data);
	           if(tmp1 !=null && tmp1.data == value)
	                return tmp1;
	           else if(tmp2 != null && tmp2.data == value)
	               return tmp2;
	           else
	               return(tmp1 == null)? tmp2:tmp1;
	        }
	    
	        public void inorder(Node root){
	            if(root == null)
	                return;
	            inorder(root.left);
	            System.out.print(root.data + " ");
	            inorder(root.right);
	        }
	    }

	public class Solution {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        Node root = new Node();
	        root.data = 1;
	        root.left = null;
	        root.right = null;
	        int[] level = new int[n+1];
	        int l = 1;
	        for(int i =1; i<=n; i++){
	            Node tmp = root.findNode(root, i);
	            //System.out.println(" " + tmp.data);
	            if(i>=Math.pow(2,l))
	                l++;
	            int n1 = sc.nextInt();
	            int n2 = sc.nextInt();
	            if(n1 == -1)
	                tmp.left = null;
	            else{
	                Node newnode = new Node();
	                newnode.data = n1;
	                tmp.left = newnode;
	                level[n1] = l;
	                //System.out.println("Added " + tmp.left.data);
	            }   
	            if(n2 == -1)
	                tmp.right = null;
	            else{
	                Node newnode = new Node();
	                newnode.data = n2;
	                tmp.right = newnode;
	                level[n2] = l;
	                //System.out.println("Added " + tmp.right.data);
	            }
	        }
	        int t = sc.nextInt();
	        for(int i = 0; i< t; i++){
	            int lev = sc.nextInt();
	            Node tmp = root;
	            for(int j = 1; j< n; j++){
	                if(level[j] == lev){
	                    tmp = root.findNode(root,j);
	                    Node tmp2 = tmp.left;
	                    tmp.left = tmp.right;
	                    tmp.right = tmp2;
	                }
	            }
	            root.inorder(root);
	            System.out.println();
	        }        
	    }
	}

}
