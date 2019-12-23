/* Dynamic Programming | When to use DP, Grid Problem
*/
class mincost
{
	static int minans(int grid[][],int n,int m)
	{
		int dp[][]=new int[n][m];
		dp[0][0]=grid[0][0];
		for(int i=1;i<n;i++)
		{
			dp[0][i]=dp[0][i-1]+grid[0][i];//fill rows
		}
		for(int i=1;i<m;i++)
		{
			dp[i][0]=dp[i-1][0]+grid[i][0];//fill columns
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<m;j++)
			{
				dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];//fill according to the minimum
			}
		}
		return dp[n-1][m-1];
	}	
	public static void main(String[] args) {
		int n=3;
		int m=3;
		int grid[][]={
			{1,2,3},
			{4,8,2},
			{1,5,3}
		};

		int ans=minans(grid,n,m); 
		System.out.print(ans);
	}
}