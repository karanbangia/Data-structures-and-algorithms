import java.util.*;
import java.lang.*;
import java.io.*;

class editdistance {
	static int editSol(String a,String b,int dp[][],int i,int j)
	{	if(i==a.length()-1 && j==b.length()-1)return 0;
		if(i==a.length()-1)
		{
			return b.length()-j-1;
		}
		if(j==b.length()-1)
		{
			return a.length()-i-1;
		}
		if(a.charAt(i)==b.charAt(j))return editSol(a,b,dp,i+1,j+1);
		if(dp[i][j]!=-1)return dp[i][j];
		dp[i][j]=Integer.MAX_VALUE;
		if(a.charAt(i)!=b.charAt(j))
		{
			dp[i][j]=Math.min(Math.min(dp[i][j],editSol(a,b,dp,i+1,j+1)+1),Math.min(editSol(	a,b,dp,i+1,j)+1,editSol(a,b,dp,i,j+1)+1));
		}
		return dp[i][j];
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
		    int k=Integer.parseInt(strl[1]);
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            String a=strs[0];
            String b=strs[1];
            int dp[][]=new int[n][k];
            for(int i=0;i<n;i++)
            {
            	for(int j=0;j<k;j++)
            	{
            		dp[i][j]=-1;
            	}
            }
            System.out.println(editSol(a,b,dp,0,0));
           	
        }
        br.close();
    }
}
