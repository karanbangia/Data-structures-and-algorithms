/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static long friendpair(int n)
    {
        if(n==0 || n==1 || n==2)return n;
        long dp[]=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=(dp[i-1]%1000000007+((i-1)*dp[i-2])%1000000007)%1000000007;
        }
        return dp[n]%1000000007;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    System.out.println(friendpair(n));
		}
	}
}