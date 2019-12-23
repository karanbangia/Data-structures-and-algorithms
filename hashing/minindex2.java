import java.util.*;
import java.lang.*;
import java.io.*;

class minindex2 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String a=br.readLine();
		    String b=br.readLine();
		    int min=Integer.MAX_VALUE;
		    int temp=0;
		    char x=0;
		    char str[]=a.toCharArray();
		    HashMap<Character,Integer> map=new HashMap<>();
		    for(int i=0;i<str.length;i++)
		    {
		        if(!map.containsKey(str[i]))
		        {
		            map.put(str[i],i);
		        }
		    }
		    for(int i=0;i<b.length();i++)
		    {
		        if(map.containsKey(b.charAt(i)))
		        {
		            if(min>map.get(b.charAt(i)))
		            {
		                min=map.get(b.charAt(i));
		                x=b.charAt(i);
		                temp=1;
		            }
		        }
		    }
		     if(temp==1)
		   {
		       System.out.println(x);
		   }
		   else
		   {
		       System.out.println("$");
		   }
        }
        br.close();
    }
}