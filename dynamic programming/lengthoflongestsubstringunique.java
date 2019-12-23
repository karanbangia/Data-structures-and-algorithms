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
		    String a=br.readLine();
		    int n=a.length();
		    int curr_len=0;
		    int max_len=Integer.MIN_VALUE;
		    HashSet<Character> hs=new HashSet<>();
		    for(int i=0;i<n;i++)
		    {
		        if(hs.contains(a.charAt(i)))
		        {
		            hs.clear();
		            hs.add(a.charAt(i));
		            curr_len=1;
		        }
		        else
		        {
		            hs.add(a.charAt(i));
		            curr_len++;
		            if(curr_len>max_len)
		            {
		                max_len=curr_len;
		            }
		        }
		    }
		    System.out.println(max_len);
		   
        }
        br.close();
    }
}