import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int knapSack(int value[],int weight[],int n,int W)
    {
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(weight[i-1]<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
            
        }
        return dp[n][W];
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			int W=Integer.parseInt(br.readLine());
		    int value[]=new int[n];
		    int weight[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        value[i] = Integer.parseInt(strs[i]);
		    }
		    line = br.readLine(); 
            String[] z = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        weight[i] = Integer.parseInt(z[i]);
		    }
		    System.out.println(knapSack(value,weight,n,W));
		    
        }
        br.close();
    }
}
 	