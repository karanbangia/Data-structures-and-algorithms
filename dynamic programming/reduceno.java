//reducing a number into 1 in minimum steps
class reduceno
{
	static int dp(int n)
	{
		int arr[]=new int[10000];
		arr[0]=0;
		arr[1]=0;
		arr[2]=1;
		arr[3]=1;

		for(int i=4;i<=n;i++)
		{
		int q1=Integer.MAX_VALUE;
		int q2=Integer.MAX_VALUE;
		int q3=Integer.MAX_VALUE;
		if(i%3==0)
		 {
		 	q1=1+arr[i/3];
		 }
		if(i%2==0)
		 {
			q2=1+arr[i/2];
		 }
		 q3=1+arr[i-1];
		 arr[i]=Math.min(q3,Math.min(q2,q1));
		
		}
		 return arr[n];
	}
	// static int naive(int n,int memo[])
	// {
	// 	if(n==1)
	// 	{
	// 		return 0;
	// 	}
	// 	int q1=Integer.MAX_VALUE;
	// 	int q2=Integer.MAX_VALUE;
	// 	int q3=Integer.MAX_VALUE;
	// 	if(memo[n]!=-1)
	// 	{
	// 		return memo[n];
	// 	}
	// 	if(n%3==0)
	// 	 {
	// 	 	q1=1+dp(n/3,memo);
	// 	 }
	// 	if(n%2==0)
	// 	 {
	// 		q2=1+dp(n/2,memo);
	// 	}
	// 	q3=1+dp(n-1,memo);
	// 	memo[n]=Math.min(q3,Math.min(q2,q1));
	// 	return memo[n];

	// }
	public static void main(String[] args) {
		int n=30;
		int memo[]=new int[1000];
		for(int i=0;i<n;i++)
		{
			memo[i]=-1;
		}
		// int ans=naive(30,memo);
		int ans=dp(9999);
		System.out.print(ans);

	}
}