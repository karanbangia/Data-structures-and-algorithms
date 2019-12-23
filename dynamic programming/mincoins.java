import java.util.*;
import java.lang.*;
import java.io.*;

class mincoins {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
		    int n=Integer.parseInt(strs[0]);
		    int k=Integer.parseInt(strs[1]);
		    int coins[]=new int[n];
		    line = br.readLine(); 
            String[] z = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        coins[i] = Integer.parseInt(z[i]);
		    }
		    int dp[][]=new int[n][k+1];
		  	for(int i=0;i<n;i++)
		  	{
		  		for(int j=0;j<=k;j++)
		  		{
		  			if(j==0)
		  			{
		  				dp[i][j]=0;
		  			}
		  			else if(i==0)
		  			{
		  				dp[i][j]=j/coins[0];
		  			}
		  			else if(j>=coins[i])
		  			{
		  				dp[i][j]=Math.min(dp[i-1][j],1+dp[i-1][j-coins[i]]);
		  			}
		  			else
		  			{
		  				dp[i][j]=dp[i-1][j];
		  			}

		  		}

		  	}
		  	int minimum=Integer.MAX_VALUE;
		  	for(int i=0;i<n;i++)
		  	{
		  		for(int j=0;j<=k;j++)
		  		{
		  			if(minimum>dp[i][j])
		  			{
		  				minimum=dp[i][j];
		  			}
		  		}
		  	}
		  	System.out.println(minimum);
        }
        br.close();
    }
}