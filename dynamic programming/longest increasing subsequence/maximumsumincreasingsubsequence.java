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
		    int dp[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        dp[i]=a[i];
		    }
		  
		    for(int i=1;i<n;i++)
		    {
		        for(int j=0;j<i;j++)
		        {
		            if(a[j]<a[i])
		            {
		                int currlen=a[i]+dp[j];
		                dp[i]=Math.max(currlen,dp[i]);
		            }
		        }
		      
		    }
		    int best=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++)
		    {
		        if(best<dp[i])
		        {
		            best=dp[i];
		        }
		    }
		    System.out.println(best);
        }
        br.close();
    }
}