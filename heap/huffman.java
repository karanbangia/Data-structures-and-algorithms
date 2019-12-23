/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class huffmanNode
{
    int data;
    char c;
    huffmanNode left;
    huffmanNode right;
}
class MyComparator implements Comparator<huffmanNode> { 
    public int compare(huffmanNode x, huffmanNode y) 
    { 
  
        return x.data - y.data; 
    } 
} 
class huffman {
    public static void printCode(huffmanNode root,String s)
    {
        if (root.left 
                == null
            && root.right 
                   == null
            && Character.isLetter(root.c)) { 
            System.out.print(s+" "); 
  
            return; 
        } 
  
        printCode(root.left, s + "0"); 
        printCode(root.right, s + "1"); 
    }
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s=br.readLine();
		    char a[]=s.toCharArray();
		    String line = br.readLine(); 
            String[] strs = line.trim().split(" ");
            int n=a.length;
            int freq[]=new int[n];
            for(int i=0;i<n;i++)
		    {
		        freq[i] = Integer.parseInt(strs[i]);
		    }
		    PriorityQueue<huffmanNode> pQueue=new PriorityQueue<>(n,new MyComparator());
		    for(int i=0;i<n;i++)
		    {
		        huffmanNode hn=new huffmanNode();
		        hn.c=a[i];
		        hn.data=freq[i];
		        hn.left=null;
		        hn.right=null;
		        pQueue.add(hn);
		    }
		    huffmanNode root=null;
		    
		    while(pQueue.size()>1)
		    {
		        huffmanNode x=pQueue.peek();
		        pQueue.poll();
		        huffmanNode y=pQueue.peek();
		        pQueue.poll();
		        huffmanNode f=new huffmanNode();
		        f.data=x.data+y.data;
		        f.c='-';
		        f.left=x;
		        f.right=y;
		        root=f;
		        pQueue.add(f);
		        
		    }
		    printCode(root,"");
		}
	}
}