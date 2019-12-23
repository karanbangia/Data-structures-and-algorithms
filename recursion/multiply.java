public class multiply
{	
	static int mult(int a,int b)
{	if(b>0)
	{
	int ans=a+mult(a,b-1);
		
	}
	if(b==0)
	{
	return 0;
	}
	if(b<0)
	{
	int ans=a+mult(a,b+1);
	}
	return ans;
	
} 

	public static void main(String[] args) {
		int a=-5;
		int b=-3;
		int ans1=a*b;
		int ans=mult(a,b);
		System.out.print(ans);

	}
}