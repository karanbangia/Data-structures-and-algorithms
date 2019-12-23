
// How to print maximum number of A’s using given four keys

// This is a famous interview question asked in Google, Paytm and many other company interviews.

// Below is the problem statement.

public class specialkeyboard
{
	static int findoptimal(int n)
	{
		if(n<=6)
		{
			return n;
		}
		int max=0;
		for(int i=n-3;i>=1;i--)
		{
			int curr=(n-i-1)*findoptimal(i);
			if(curr>max)
			{
				max=curr;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int n=7;
		int ans=findoptimal(n);
		System.out.print(ans);
	}
}
