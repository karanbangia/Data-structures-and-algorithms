/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static long steps(int n,long dp[])
    {
        if(n==0)return 1;
        if(n==1 || n==2)return n;
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=2;
        for(int i=4;i<=n;i++)
        {
            dp[i]=1+Math.min(dp[i-1],dp[i-2]);
        }
        return dp[n];
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    long dp[]=new long[n+1];
		    System.out.println(steps(n,dp));
		}
	}
}