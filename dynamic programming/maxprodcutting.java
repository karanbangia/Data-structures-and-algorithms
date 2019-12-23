import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static long rodproduct(int n)
    {
            long dp[]=new long[n+1];
            dp[0]=0;
            dp[1]=0;
            long best;
            for(int len=2;len<=n;len++)
            {
                for(int cut=1;cut<len;cut++)
                {
                    best=cut*dp[len-cut];
                    dp[len]=Math.max(best,Math.max(dp[len],cut*(len-cut)));
                }
            }
            return dp[n];
            
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
            System.out.println(rodproduct(n)%1000000007);
        }
        br.close();
    }
}