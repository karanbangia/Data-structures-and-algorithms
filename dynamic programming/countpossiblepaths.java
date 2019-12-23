import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
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
		    long dp[][]=new long[n][k];
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<k;j++)
		        {
		            if(j==0 || i==0)
		            {
		                dp[i][j]=1;
		            }
		            else
		            {
		                dp[i][j]=(dp[i-1][j]%1000000007+dp[i][j-1]%1000000007)%1000000007;
		            }
		        }
		    }
		    System.out.println( dp[n-1][k-1]%1000000007);
		   
        }
        br.close();
    }
}
