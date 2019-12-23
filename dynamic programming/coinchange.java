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
		    int n=Integer.parseInt(br.readLine());
		    String line = br.readLine(); 
            String[] z = line.trim().split("\\s+");
			int coins[]=new int[n];
            for(int i=0;i<n;i++)
		    {
		        coins[i] = Integer.parseInt(z[i]);
		    }
		    int k=Integer.parseInt(br.readLine());
		    int dp[][]=new int[n][k+1];
		  	for(int i=0;i<n;i++)
		  	{
		  		for(int j=0;j<=k;j++)
		  		{
		  			if(j==0)
		  			{
		  				dp[i][j]=1;
		  			}
		  			else if(i==0)
		  			{
		  				if(j%coins[0]==0 && j>=coins[0])
		  				{
		  					dp[i][j]=1;
		  				}
		  				else
		  				{
		  					dp[i][j]=0;
		  				}
		  			}
		  			else if(j>=coins[i])
		  			{
		  				
		  					dp[i][j]=dp[i-1][j]+dp[i][j-coins[i]];
		  			}
		  			else
		  			{
		  				dp[i][j]=dp[i-1][j];
		  			}

		  		}

		  	}
		  	System.out.println(dp[n-1][k]);
		  
        }
        br.close();
    }
}