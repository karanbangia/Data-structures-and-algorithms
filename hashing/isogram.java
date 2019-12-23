import java.util.*;
import java.lang.*;
import java.io.*;

class isogram {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s=br.readLine();
		    char a[]=s.toCharArray();
		    int x=a.length;
		   
		    HashMap<Character,Integer> map=new HashMap<>();
		    for(int i=0;i<x;i++)
		    {
		        if(map.get(a[i])==null)
		        {
		            map.put(a[i],1);
		        }
		         else
		        {
		            map.put(a[i],map.get(a[i])+1);
		        }
		    }
		     int temp=0;
		      for(Map.Entry<Character,Integer> entry: map.entrySet())
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
