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
		    long a[]=new long[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Long.parseLong(strs[i]);
		    }
		    Stack<Long> s=new Stack<>();
		    HashMap<Long,Long> map=new HashMap<>();
		    for(int i=0;i<n;i++)
		    {
		        while(!s.isEmpty() && a[i]>s.peek())
		        {
		            long rv=s.pop();
		            map.put(rv,a[i]);
		            
		            
		        }
		        s.push(a[i]);
		    }
		    while(!s.isEmpty())
		    {
		         long x=-1;
		         map.put(s.pop(),x);
		         
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(map.get(a[i])+" ");
		    }
		    System.out.println();
		    
        }
        br.close();
    }
}