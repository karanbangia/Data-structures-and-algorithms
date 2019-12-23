import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void ans(int n)
    {
        long dp[]=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        System.out.print(1+" ");
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
            System.out.print(dp[i]+" ");
            
        }
        
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    ans(n);
		    System.out.println();
        }
        br.close();
    }
}