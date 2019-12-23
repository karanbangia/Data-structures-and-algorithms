import java.util.*;
import java.lang.*;
import java.io.*;
class maximumsumpath
{
	//static int sum=0;
	static boolean isValid(int i,int m)
	{
		if(i<m && i>=0)
		{
			return true;
		}
		return false;
	}
	static int helper(int mat[][],int n,int m)
	{
		int best=Integer.MIN_VALUE;
		int dp[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				dp[i][j]=-1;
			}
		}
		for(int i=0;i<n;i++)
		{
			int result=ans(mat,1,i,n,m,mat[0][i],dp);
			System.out.print(result+" ");
			best=Math.max(best,result);
		}
		return best;
	}
	static int ans(int mat[][],int row,int col,int n,int m,int sum,int dp[][])
	{
		if(row==n)
		{
			return sum;
		}
		if(dp[row][col]!=-1)return dp[row][col];
		int x=Integer.MIN_VALUE;
		int y=Integer.MIN_VALUE;	
		if(isValid(col-1,m))
		{
			int tempsum=sum+mat[row][col-1];
			 x=ans(mat,row+1,col-1,n,m,tempsum,dp);
		}
		if(isValid(col+1,m))
		{
			int tempsum=sum+mat[row][col+1];
			 y= ans(mat,row+1,col+1,n,m,tempsum,dp);
		}
		return dp[row][col]=Math.max(dp[row][col],Math.max(x,y));
			
	}
	public static void main(String[] args) {
		int mat[][] = { 
					 {5, 6, 1, 7},
               		 {-2, 10, 8, -1},
                	 {3, -7, -9, 11},
                     {12, -4, 2, 6} 
                 		};
        int n=mat.length;
        int m=mat[0].length;
        System.out.print(helper(mat,n,m));
	}
}