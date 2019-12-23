import java.util.*;
import java.lang.*;
import java.io.*;

class mixtures {
	static long csum(long a[],int i,int j)
	{
		long sum=0;
		for(int k=i;k<=j;k++)
		{
			sum+=a[k];
			sum%=100;
		}
		return sum;
	}
	static long solveMixtures(long a[],long dp[][],int i,int j)
	{
		if(i>=j)return 0;
		if(dp[i][j]!=-1)return dp[i][j];
		dp[i][j]=Long.MAX_VALUE;
		for(int k=i;k<=j;k++)
		{
			dp[i][j]=Math.min(dp[i][j],solveMixtures(a,dp,i,k)+solveMixtures(a,dp,k+1,j)+csum(a,i,k)*csum(a,k+1,j));
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
		    long a[]=new long[n];
			    String line = br.readLine(); 
	            String[] strs = line.trim().split("\\s+");
	            for(int i=0;i<n;i++)
			    {
			        a[i] = Long.parseLong(strs[i]);
			    }
			    long dp[][]=new long[n][n];
			    for(int i=0;i<n;i++)
			    {
			    	for(int j=0;j<n;j++)
			    	{
			    		dp[i][j]=-1;
			    	}
			    }
			    System.out.println(solveMixtures(a,dp,0,n-1));
		   
        }
        br.close();
    }
}