/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static long dice(int m,int n,int x,long dp[][])
    {
        if(n==0 && x==0)return 1;
        if(n==0 || x<=0)return 0;
        if(dp[n][x]!=-1)return dp[n][x];
        long ans=0;
        for(int i=m;i>=1;i--)
        {
            ans+=dice(m,n-1,x-i,dp);
        }
        return dp[n][x]=ans;
        
        
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    long dp[][]=new long[n+1][x+1];
		    
		    for(int i=0;i<=n;i++)
		    {
		        for(int j=0;j<=x;j++)
		        {
		            dp[i][j]=-1;
		        }
		    }
		    System.out.println(dice(m,n,x,dp));
		}
	}
}