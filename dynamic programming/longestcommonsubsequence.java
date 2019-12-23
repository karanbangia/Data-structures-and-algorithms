import java.util.*;
import java.lang.*;
import java.io.*;

class longestcommonsubsequence{
    static int lcs(char x[],char y[],int n,int m)
    {
        if(m==0 || n==0)return 0;
        if(x[n-1]==y[m-1])
        {
            return 1+lcs(x,y,n-1,m-1);
        }
        return Math.max(lcs(x,y,n-1,m),lcs(x,y,n,m-1));
    }
    static int lcsmemoized(char x[],char y[],int n,int m,int dp[][])
    {
        if(m==0 || n==0)return 0;
        if(dp[n-1][m-1]!=-1)return dp[n-1][m-1];
        if(x[n-1]==y[m-1])
        {
            return dp[n-1][m-1]=1+lcs(x,y,n-1,m-1);
        }
        return dp[n-1][m-1]=Math.max(dp[n-1][m-1],Math.max(lcs(x,y,n-1,m),lcs(x,y,n,m-1)));
    }
    static int lcsdynamic(char x[],char y[],int n,int m)
    {
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(j==0 || i==0)
                {
                    dp[i][j]=0;
                }
                if(x[i-1]==y[j-1])
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s=br.readLine();
			String strl[]=s.trim().split("\\s+");
		    int n=Integer.parseInt(strl[0]);
		    int m=Integer.parseInt(strl[1]);
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    char x[]=s1.toCharArray();
		    char y[]=s2.toCharArray();
            int lp[][]=new int[n][m];
            for(int i=0;i<n;i++)
            {
                for (int j=0;j<m;j++)
                 {
                    lp[i][j]=-1;    
                }
            }
		    System.out.println(lcsmemoized(x,y,n,m,lp));
            
        }
        br.close();
    }
}
