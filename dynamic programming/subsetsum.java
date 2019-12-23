import java.util.*;
import java.lang.*;
import java.io.*;
//{1,5,5,11}-->{1,5,5} && {11};
class subsetsum {
    static boolean subsetexist(int a[],int n)
    {
        int sum=0;
        for(Integer i:a)
        {
            sum+=i;
        }
        if(sum%2!=0)
        {
            return false;
        }
        sum=sum/2;
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
           dp[i][0]=true;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(a[i-1]>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-a[i-1]];
                }
            }
        }
        return dp[n][sum];
         
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    if(subsetexist(a,n))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
        }
        br.close();
    }
}