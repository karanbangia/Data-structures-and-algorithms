// Given a binary matrix, find out the maximum size square sub-matrix with all 1s.

// Input:

// The first line of input contains an integer T denoting the number of test cases.
// The first line of each test case is n and m,n is the number of rows and m is the number of columns.
// The second line of each test case contains array C[n][m] in row major form.

// Output:

// Print maximum size square sub-matrix.

// Constraints:

// 1 ≤ T ≤ 100
// 1 ≤ n,m ≤ 50
// 0 ≤ C[n][m] ≤ 1

// Example:

// Input:
// 3
// 5 6
// 0 1 0 1 0 1 1 0 1 0 1 0 0 1 1 1 1 0 0 0 1 1 1 0 1 1 1 1 1 1
// 2 2
// 1 1 1 1
// 2 2
// 0 0 0 0

// Output:
// 3
// 2
// 0
//  
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int solve(int a[][],int n,int m)
    {
        int dp[][]=new int[n][m];
         for(int i=0;i<n;i++)
    	    {
    	        for(int j=0;j<m;j++)
    	        {
    	            dp[i][j]=0;   
    	        }
    	        
    	    }
        for(int i=0;i<n;i++)
        {
           
            dp[i][0]=a[i][0];
        }  
        for(int i=0;i<m;i++)
        {
           
            dp[0][i]=a[0][i];
        }  
         for(int i=1;i<n;i++)
		    {
		        for(int j=1;j<m;j++)
		        {
		            if(a[i][j]==1)
		            {
		                int k1=Math.min(dp[i-1][j-1],dp[i-1][j]);
                        int k2=Math.min(k1,dp[i][j-1]);
                        dp[i][j]=1+k2;
		                
		            }
		            else
		            {
		                dp[i][j]=0;
		            }
		        }
		        
		    }
		    int max=0;
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		                if(max<dp[i][j])
		                {
		                    max=dp[i][j];
		                }
		        }
		        
		    }
		    return max;
		    
        
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
		    int a[][]=new int[n][m];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            int k=0;
            for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            a[i][j] = Integer.parseInt(strs[k]);  
		            k++;  
		        }
		        
		    }
		    int ans=solve(a,n,m);
		    System.out.println(ans);
        }
        br.close();
    }
}