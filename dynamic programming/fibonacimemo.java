//using top down approch
class fibonacimemo
{
	static int fib(int n,int memo[])
	{
		if(n==1 || n==0)
		{
			return n;
		}
		if(memo[n]!=-1)
		{
			return memo[n];
		}
		int ans=fib(n-1,memo)+fib(n-2,memo);
		memo[n]=ans;
		return ans;
	}
	public static void main(String[] args) {
		int n=7;
		int memo[]=new int[n+1];
		for(int i=0;i<=n;i++)
		{
			memo[i]=-1;
		}
		int ans=fib(n,memo);

		System.out.print(ans);
	}
}