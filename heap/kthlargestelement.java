import java.util.*;
import java.lang.*;
import java.io.*;

class kthlargestelement {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s=br.readLine();
			String strl[]=s.trim().split("\\s+");
		    int k=Integer.parseInt(strl[0]);
		    int n=Integer.parseInt(strl[1]);
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    PriorityQueue<Integer> pq=new PriorityQueue<>();
		    
		    
		    for(int i=0;i<k-1;i++)
		    {
		       System.out.print(-1+" "); 
		        
		    }
		    for(int i=0;i<k;i++)
		    {
		        if(!pq.contains(a[i]))
		        {
		             pq.add(a[i]);
		        }
		       
		    }
		    System.out.print(pq.peek()+" "); 
		    for(int i=k;i<n;i++)
		    {
		       

		      // if(k==pq.size())
		      // {
		           
		      //     System.out.print(pq.
		       if(a[i]>pq.peek())
		       {
		           pq.poll();
		           pq.add(a[i]);
		           System.out.print(pq.peek()+" ");
		       }
		       else if(a[i]<=pq.peek())
		       {
		           System.out.print(pq.peek()+" ");
		       }
		       
		       
		    }
		    System.out.println();
        }
        br.close();
    }
}
