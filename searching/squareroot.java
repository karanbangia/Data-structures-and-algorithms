class squareroot
{	
	static float calcuteroot(int n,int p)
	{
		int strt=0;
		int end=n;
		int ans=0;
		int mid;
		while(strt<=end)
		{
			mid=(strt+end)/2;
			if(mid*mid==n)
			{
				ans=mid;
				break;
			}
			if(mid*mid<n)
			{
				strt=mid+1;
				ans=mid;
			}
			else
			{
				end=mid-1;
			}
		}
		float inc=0.1f;
		float s=Float.valueOf(ans);
		for(int i=0;i<p;i++)
		{
			while(s*s<n)
			{
				s+=inc;
			}
			s-=inc;
			inc/=10;
		}
		return s;

	}
	public static void main(String[] args) {
		System.out.print(calcuteroot(10,2));

	}
}