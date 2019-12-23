	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class GFG {
	    static long seq(int current,int sum,int n,int count)
	    {
	        if(count==n+1)
	        {
	            return 0;
	        }
	        count++;
	        int i;
	        long curr=1;
	        for(i=current;i<current+sum;i++)
	        {
	            curr*=i;
	        }
	        return curr+seq(current+sum,sum+1,n,count);
	    }
		public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	  
	        // taking input of number of testcase 
	        int t = Integer.parseInt(br.readLine().trim());
			while(t-->0)
			{
			    int n=Integer.parseInt(br.readLine().trim());
			    System.out.println(seq(1,1,n,1));
			  
	        }
	    }
	}