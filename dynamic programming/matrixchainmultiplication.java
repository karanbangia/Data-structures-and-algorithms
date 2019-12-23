import java.util.*;
import java.lang.*;
import java.io.*;

class matrixchainmultiplication {
	static long matrixSol(int a[],long dp[][],int i,int j)
	{
		if(i>=j)return 0;
		if(dp[i][j]!=-1)return dp[i][j];
		dp[i][j]=Long.MAX_VALUE;
		for(int k=i;k<=j;k++)
		{
			dp[i][j]=Math.min(dp[i][j],matrixSol(a,dp,i,k)+matrixSol(a,dp,k+1,j)+a[i-1]*a[k]*a[j]);
		}
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
		    long dp[][]=new long[n][n];
		    for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<n;j++)
		    	{
		    		dp[i][j]=-1;
		    	}
		    }
		    System.out.println(matrixSol(a,dp,1,n-1));

		   
        }
        br.close();
    }
}