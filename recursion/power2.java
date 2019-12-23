public class power2
{
	static int advance(int a,int b)
	{
		if(b==0)
		{
			return 1;
		}
		int ans=advance(a,b/2);
		ans*=ans;
		if((b&1)==1)
		{
			return a*ans;
		}
		return ans;
	}
	public static void main(String[] args) {
		int a=2;
		int b=9;
		int ans=advance(a,b);
		System.out.print(ans);
	}
}