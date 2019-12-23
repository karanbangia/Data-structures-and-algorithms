import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{   HashMap<Long,Integer> ts1 = new HashMap<>();
		    int n=Integer.parseInt(br.readLine());
		    long a[]=new long[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Long.parseLong(strs[i]);
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        if(ts1.get(a[i])==null)
		        {
		           ts1.put(a[i],1);    
		        }
		        else
		        {
		           ts1.put(a[i],ts1.get(a[i])+1);
		        }
		        
		        
		    }
		     for(Map.Entry<Long,Integer> entry: ts1.entrySet())
		    {
		        if(entry.getValue()==1)
		        {
		        	System.out.println(entry.getKey());
		        	break;
		        }
		     
            }
		}
        br.close();
    }
}