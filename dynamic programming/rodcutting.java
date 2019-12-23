import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
     
    static int rodcutting(int arr[],int n)
    {
        int dp[]=new int[n+1];
        dp[0]=0;
        int best;
        for(int len=1;len<=n;len++)
        {
            for(int cut=1;cut<=len;cut++)
            {
                 best=arr[cut]+dp[len-cut];
                dp[len]=Math.max(dp[len],best);
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
		    int a[]=new int[n+1];
		    a[0]=0;
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            int j=0;
            for(int i=1;i<=n;i++)
		    {
		        a[i] = Integer.parseInt(strs[j]);
		        j++;
		    }
		    System.out.println(rodcutting(a,n));
		    
        }
        br.close();
    }
}