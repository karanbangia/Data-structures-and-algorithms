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
		    PriorityQueue<Integer> pQueue =new PriorityQueue<Integer>();
		    for(int i=0;i<n;i++)
		    {
		        pQueue.add(a[i]);
		    }
		    String s1="";
		    String s2="";
		    for(int i=0;i<n;i++)
		    {
		        if(i%2==0)
		        {
		            int x=pQueue.poll();
		            s1+=Integer.toString(x);
		        }
		        else
		        {int b=pQueue.poll();
		        s2+=Integer.toString(b);}
		    }
		    System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		    
        }
        br.close();
    }
}