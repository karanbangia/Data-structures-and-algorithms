import java.util.*;
import java.lang.*;
import java.io.*;

class eggdropping {
	static int helper(int dp[][],int egg,int floor)
	{
		int attempts=Integer.MAX_VALUE;
		int best;
		for(int i=1;i<=floor;i++)
		{
			if(i==1)
			{
				best=1+Math.max(0,dp[egg][floor-1]);	
			}
			else if(i==floor)
			{
				best=1+Math.max(dp[egg-1][i-1],0);
			}
			else
			{
				best=1+Math.max(dp[egg-1][i-1],dp[egg][floor-i]);
			}
			
			
			attempts=Math.min(attempts,best);
		}
		return attempts;
	}
	static int optimfloor(int egg,int floor,int dp[][])
	{
		for(int i=1;i<=floor;i++)
		{
			dp[1][i]=i;
		}
		for(int i=2;i<=egg;i++)
		{
			for(int j=1;j<=floor;j++)
			{
				if(i>j)dp[i][j]=dp[i-1][j];
				else
				{
					dp[i][j]=helper(dp,i,j);
				}

			}
		}
		return dp[egg][floor];
	}
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s=br.readLine();
			String strl[]=s.trim().split("\\s+");
		    int n=Integer.parseInt(strl[0]);
		    int k=Integer.parseInt(strl[1]);
		    int dp[][]=new int[n+1][k+1];

		    System.out.println(optimfloor(n,k,dp));
		    // System.out.println("your dp looks like this");
		    // //  for(int i=0;i<=n;i++)
		    // {
		    // 	for(int j=0;j<=k;j++)
		    // 	{
		    // 		System.out.print(dp[i][j]+" ");
		    // 	}
		    // 	System.out.println();
		    // }
		    
        }
        br.close();
    }
}
