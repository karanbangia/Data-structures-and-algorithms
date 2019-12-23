class bottomupfib
{
	int fib(int n)
	{
		int dp[]=new int[100];
		dp[0]=0;
		dp[1]=1;

		for(int currNum=2;currNum<=n;currNum++)
		{
			dp[currNum]=dp[currNum-1]+dp[currNum-2];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		bottomupfib ob=new bottomupfib();

		int n=7;
		int ans=ob.fib(n);

		System.out.print(ans);
	}
}