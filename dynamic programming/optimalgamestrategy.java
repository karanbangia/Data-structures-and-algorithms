import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int optimStrat(int a[],int dp[][],int i,int j)
    {
       if(i>j)return 0;
       if(dp[i][j]!=-1)return dp[i][j];
       dp[i][j]=Math.max(a[i]+Math.min(optimStrat(a,dp,i+1,j-1),optimStrat(a,dp,i+2,j)),a[j]+Math.min(optimStrat(a,dp,i,j-2),optimStrat(a,dp,i+1,j-1)));
       return dp[i][j];
       }
	
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

			    int dp[][]=new int[n][n];
			    for(int i=0;i<n;i++)
			    {
			        for(int j=0;j<n;j++)
			        {
			            dp[i][j]=-1;
			        }
			    }
			    System.out.println(optimStrat(a,dp,0,n-1));
        }
        br.close();
    }
}