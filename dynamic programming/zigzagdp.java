import java.util.*;
import java.lang.*;
import java.io.*;
class zigzagdp
 {
 	static int zigzag(int dp[][],int row,int col,int n)
 	{
 		int max=Integer.MIN_VALUE;
 		for(int i=0;i<n;i++)
 		{
 			if(i!=col)
 			{
 				if(max<dp[row][i])
 				{
 					max=dp[row][i];
 				}
 			}
 		}
 		return max;
 	}
	public static void main (String[] args)
	 {
	 Scanner input=new Scanner(System.in);
	 int t=input.nextInt();
	 while(t-->0)
	 {
	     int n=input.nextInt();
	     int mat[][]=new int[n][n];
	     int dp[][]=new int[n][n];
	     
	     for(int i=0;i<n;i++)
	     {
	         for(int j=0;j<n;j++)
	         {
	             mat[i][j]=input.nextInt();
	             
	             if(i==0)
	             {dp[i][j]=mat[i][j];}//max=Math.max(dp[i][j],max);}
	         }
	     }
	     //int dp[][]=new int[n][n];
	     
	     
	     for(int i=1;i<n;i++)
	     {
	         for(int j=0;j<n;j++)
	         {
	             dp[i][j]=mat[i][j]+zigzag(dp,i-1,j,n);
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
	 }
}