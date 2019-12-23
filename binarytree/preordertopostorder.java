/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

 class Node
    {
        int data;
        Node left, right;
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
class preordertopostorder {
 
    static int index=0;
     Node deserialize(int a[],int min,int max,int n)
    {
        if(index>=n)return null;
        Node root=null;
        if(a[index]>min && a[index]<max)
        {
            root=new Node(a[index]);
            index=index+1; 
        
        root.left=deserialize(a,min,root.data,n);
        root.right=deserialize(a,root.data,max,n);
         }
        return root;
    }
    static void postorder(Node x)
    {
        if(x==null)return;
        postorder(x.left);
        postorder(x.right);
        System.out.print(x.data+" ");
    }
	public static void main (String[] args) throws IOException {
        preordertopostorder ob=new preordertopostorder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
       
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    index=0;
		    Node nn=ob.deserialize(a,Integer.MIN_VALUE,Integer.MAX_VALUE,n);
		    postorder(nn);
		    System.out.println();
        }
    }
}