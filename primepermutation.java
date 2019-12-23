import java.util.*;
import java.io.*;
class primepermutation
{
	static long fact(int n)
	{
		if(n==0 || n==1)
		{
			return n%1000000007;
		}
		return n*fact(n-1)%1000000007;
	}
	static long ans(int n)
	{
		boolean primes[]=new boolean[n+1];
		Arrays.fill(primes,true);
		primes[0]=false;
		primes[1]=false;
		for(int i=2;i<n;i++)
		{

			if(primes[i])
			{
			for(int j=i*i;j<=n;j+=i)
				{

						primes[j]=false;
					
				}
			}
		}
		int count=0;
		for(int i=0;i<=n;i++)
		{
			if(primes[i])
			{
				count++;
			}
		}
		System.out.println(count);
		long ans=fact(count)*fact(n-count)%1000000007;
		return ans;


	}
	public static void main(String[] args) {
		int n=20;
		System.out.println(ans(n));
	}
}