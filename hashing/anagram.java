import java.util.*;
import java.lang.*;
import java.io.*;

class anagram {
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
		    int sum=0;
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++)
		    {
		    	sum=0;
		        for(int j=0;j<a.length;j++)
		        {
		            sum+=(int)a[i].charAt(j);
		        }
		        if(map.containsKey(sum))
		        {
		            map.put(sum,map.get(sum)+1);
		        }
		        else
		        {
		            map.put(sum,1);
		        }
		    }
		    for(Map.Entry<Integer,Integer> entry:map.entrySet())
		    {
		        System.out.print(entry.getValue()+" ");
		    }
		    System.out.println();
        }
        br.close();
    }
}