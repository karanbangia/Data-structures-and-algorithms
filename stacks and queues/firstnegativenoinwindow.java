import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
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
		    int k=Integer.parseInt(br.readLine());
		    Queue<Integer> q=new LinkedList<>();
		    int i;
		    for(i=0;i<k;i++)
		    {
		        if(a[i]<0)q.add(i);
		    }
		    System.out.println("index is"+i);
		    for(;i<a.length;i++)
		    {
		        if(q.size()!=0)
		        {
		            System.out.print(a[q.peek()]+" ");
		        }
		        else
		        {
		            System.out.print(0+" ");
		        }
		        while(q.size()!=0 && q.peek()<=(i-k))
		        {
		            int x=q.remove();
		        }
		        if(a[i]<0)q.add(i);
		    }
		    if(q.size()!=0)
		    {
		         System.out.print(a[q.peek()]+" ");
		    }
		    else
		        {
		            System.out.print(0+" ");
		        }
		    System.out.println();
        }
        br.close();
    }
}