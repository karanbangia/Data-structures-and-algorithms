class cellmitosis
{
	static int solveCellProblem(int n,int x,int y,int z)
	{
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=0;
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				dp[i]=Math.min(dp[i/2]+x,dp[i-1]+y);
			}
			else
			{
				dp[i]=Math.min(dp[(i+1)/2]+x+z,dp[i-1]+y);
			}
		}
		return dp[n];

	}
	public static void main(String[] args) {
		int n=5;
		int x=2;
		int y=1;
		int z=3;
		System.out.println(solveCellProblem(n,x,y,z));
	}
}