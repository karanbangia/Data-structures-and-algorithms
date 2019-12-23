import java.lang.*;
import java.io.*;

class GFG {
	
	static int path(int dp[][],int row,int col,int n)
 	{
 	    if(col==0)
 	    {
 	        return Math.max(dp[row][col],dp[row][col+1]);
 	    }
 	    if(col==n-1)
 	    {
 	      return Math.max(dp[row][col],dp[row][col-1]);  
 	    }
 	    
 		return Math.max(dp[row][col],Math.max(dp[row][col-1],dp[row][col+1]));
 	}
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int a[][]=new int[n][n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            int k=0;
            for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            a[i][j] = Integer.parseInt(strs[k]);
		            k++;
		        }
		        
		    }
		    int dp[][]=new int[n][n];
		    for(int i=0;i<n;i++)
		    {
		      dp[0][i]=a[0][i];  
		    }
    	    for(int i=1;i<n;i++)
    	    {
    	         for(int j=0;j<n;j++)
    	         {
    	             dp[i][j]=a[i][j]+path(dp,i-1,j,n);
    	         }
    	     }
    	      int max=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++)
		    {
		    	if(max<dp[n-1][i])
 				{
 					max=dp[n-1][i];
 				}
		    }
		    System.out.println(max);
		}
        br.close();
    }
}