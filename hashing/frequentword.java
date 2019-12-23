import java.util.*;
import java.lang.*;
import java.io.*;

class frequentword {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    String a[]=new String[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = strs[i];
		    }
		    HashMap<String,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++)
		    {
		        if(map.containsKey(a[i]))
		        {
		            map.put(a[i],map.get(a[i])+1);
		        }
		        else
		        {
		            map.put(a[i],1);
		        }
		    }
		    int max=Integer.MIN_VALUE;
		    String freq="";
		    for(Map.Entry<String,Integer> entry:map.entrySet())
		    {
		        String s=entry.getKey();
		        int val=entry.getValue();
		        if(max<val)
		        {
		            max=val;
		            freq=s;
		            
		        }
		        if(max==val)
		        {
		            freq=s;
		        }
		    }
		    System.out.println(freq);
		    
        }
        br.close();
    }
}