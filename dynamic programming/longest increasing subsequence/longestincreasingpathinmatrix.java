	import java.io.*;
	import java.util.*;
	import java.lang.*;

	class longestincreasingpathinmatrix
	{
		static class point
		{
			int x;
			int y;
			point(int x,int y)
			{
				this.x=x;
				this.y=y;
			}
		}
		static boolean isSafe(int n,int m,int i,int j)
		{
			if(i<n && j<m && i>=0 && j>=0)
				return true;
			return false;
		}
		static int dfs(int mat[][],int n,int m)
		{
			int dp[][]=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					dp[i][j]=1;
				}
			}
			Stack<point> s=new Stack<>();
			s.push(new point(0,0));
			while(!s.isEmpty())
			{
				point rv=s.pop();
				int i=rv.x;
				int j=rv.y;
				if(isSafe(n,m,i+1,j))
				{
					if(mat[i+1][j]>mat[i][j])
					{
						dp[i+1][j]=dp[i][j]+1;
						s.push(new point(i+1,j));
					}
				}
				if(isSafe(n,m,i,j+1))
				{
					if(mat[i][j+1]>mat[i][j])
					{
						dp[i][j+1]=dp[i][j]+1;
						s.push(new point(i,j+1));
					}
					
				}

			}
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					max=Math.max(max,dp[i][j]);
				}
			}
			return max;

		}
	public static void main(String[] args)
	{
		int mat[][] = { 
	    { 1, 2, 3, 4 }, 
	    { 2, 2, 3, 4 }, 
	    { 3, 2, 3, 4 }, 
	    { 4, 5, 6, 7 }, 
							 }; 	

			int n=4,m=4;
			System.out.println(dfs(mat,n,m));
	}
	}