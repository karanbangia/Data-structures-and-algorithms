import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int lps(char a[],int n)
    {
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
         dp[i][i]=1;   
        }
        for(int l=2;l<=n;l++)
        {
            for(int i=0;i<n-l+1;i++)
            {
                int j=i+l-1;
                if(a[i]==a[j] && l==2)
                {
                    dp[i][j]=2;
                }
                else if(a[i]==a[j])
                {
                    dp[i][j]=2+dp[i+1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }
        return dp[0][n-1];
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s=br.readLine();
		    char a[]=s.toCharArray();
		    int n=a.length;
		    System.out.println(lps(a,n));
		   
        }
        br.close();
    }
}