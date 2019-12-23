import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int cuttedSegment(int n,int dp[],int x,int y,int z)
    {
        if(n<0)return Integer.MIN_VALUE;
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        dp[n]=1+Math.max(cuttedSegment(n-x,dp,x,y,z),Math.max(cuttedSegment(n-y,dp,x,y,z),cuttedSegment(n-z,dp,x,y,z)));
        return dp[n];
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s=br.readLine();
		    int n=Integer.parseInt(s);
			s=br.readLine();
			String strl[]=s.trim().split("\\s+");
			int a[]=new int[3];
		    for(int i=0;i<3;i++)
		    {
		        a[i]=Integer.parseInt(strl[i]);
		    }
		    int dp[]=new int[n+1];
		    for(int i=0;i<=n;i++)
		    {
		        dp[i]=-1;
		    }
		    System.out.println(cuttedSegment(n,dp,a[0],a[1],a[2]));
        }
        br.close();
    }
}
 