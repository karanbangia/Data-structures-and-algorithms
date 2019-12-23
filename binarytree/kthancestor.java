{
//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
public class GFG {
    
static void inorder(Node root){
        if(root == null)
            return;
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
	public static void main (String[] args) {{
//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
public class GFG {
    
    public sta
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    HashMap<Integer, Node> map = new HashMap<>();
		    
		    int n = sc.nextInt();
             
            Node root = null;
            Node parent;
		    while(n-- > 0){
		        int p = sc.nextInt();
		        if(!map.containsKey(p)){
		            root = new Node(p);
		            map.put(root.data, root);
		        }
		        parent = map.get(p);
		        
		        int ch = sc.nextInt();
		        Node child = new Node(ch);
		        
		        char c = sc.next().charAt(0);
		        if(c == 'L')
		            parent.left = child;
		        else if(c == 'R')
		            parent.right = child;
		            
		        map.put(ch, child);
		    }
		    
		    int k = sc.nextInt();
		    int target = sc.nextInt();
		    
		    Solution obj = new Solution();
		    int ans = obj.kthAncestor(root, k, target);
		    System.out.println(ans);
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
Structure of Node class is:
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    HashMap<Integer,Integer> depth;
    HashMap<Integer,Node> parent;
    public int kthAncestor(Node root, int k, int node){
        if(root==null)return -1;
        if(k==0)return -1;
        depth=new HashMap<>();
        parent=new HashMap<>();
        dfs(root,null);
        int d=depth.get(node)-k;
        if(d<0)
        {
            return -1;
        }
        Node p=parent.get(node);
        if(p==null)
        {
            return -1;
        }
        for(int i=0;i<k;i++)
        {
          
           
            if(depth.get(p.data)==d)
            {
                return p.data;
            }
            
                p=parent.get(p.data);  
        }
        return -1;
       
        
    }
    public void dfs(Node root,Node par)
    {
        if(root==null)return;
        if(par==null)
        {
            depth.put(root.data,0);
            parent.put(root.data,null);
        }
        else
        {
             depth.put(root.data,1+depth.get(par.data));
             parent.put(root.data,par);
        }
        dfs(root.left,root);
        dfs(root.right,root);
    }
}