	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class travellingsalesman {
	    static int tsp(int mat[][],int mask,int pos,int n,int dp[][],int visited_all)
	    {
	        if(mask==visited_all)
	        {
	            return mat[pos][0];
	        }
	        if(dp[mask][pos]!=-1)
	        {
	            return dp[mask][pos];
	        }
	        int ans=Integer.MAX_VALUE;
	        int new_ans=0;
	        for(int city=0;city<n;city++)
	        {
	            int x=mask&(1<<city);
	            if(x==0)
	            {
	                new_ans=mat[pos][city]+tsp(mat,mask|(1<<city),city,n,dp,visited_all);
	                 ans=Math.min(new_ans,ans);
	            }
	           
	        }
	        return dp[mask][pos]=ans;
	    }
		public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	  
	        // taking input of number of testcase 
	        int t = Integer.parseInt(br.readLine().trim());
			while(t-->0)
			{
			    int n=Integer.parseInt(br.readLine().trim());
			    int mat[][]=new int[n][n];
	            for(int i=0;i<n;i++)
			    {
			        String line[]=br.readLine().trim().split(" ");
			        for(int j=0;j<n;j++)
			        {
			            mat[i][j]=Integer.parseInt(line[j]);
			        }
			    }
			    int dp[][]=new int[1<<n][n];
			    for(int i=0;i<(1<<n);i++)
			    {
			    	for(int j=0;j<n;j++)
			    	{
			    		dp[i][j]=-1;
			    	}
			       
			    }
			    int visited_all=(1<<n)-1;
			    System.out.println(tsp(mat,1,0,n,dp,visited_all));
	        } 
	    }
	}