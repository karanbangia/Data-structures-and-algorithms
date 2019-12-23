//use comapre to to comapare string  in lexiographic order
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
		    String s[]=new String[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        s[i] = strs[i];
		    }
		    HashMap<String,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++)
		    {
		        if(map.get(s[i])==null)
		        {
		            map.put(s[i],1);
		        }
		        else
		        {
		            map.put(s[i],map.get(s[i])+1);
		        }
		    }
		    int max=Integer.MIN_VALUE;
		    String name="";
		    for(Map.Entry<String,Integer> entry: map.entrySet())
		    {
		        int temp=0;
		        String key=entry.getKey();
		        int val=entry.getValue();
		        if(max<val)
		        {
		            max=val;
		            name=key;
		        }
		       else if(val==max && name.compareTo(key)>0)
		       {
		           name=key;
		       }
		       
		        
		    }
		    System.out.println(name+" "+max);
        }
        br.close();
    }
}