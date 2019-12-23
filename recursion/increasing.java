public class increasing
{
	static void increasing(int n)
	{
		if(n==6)
		{
			return;
		}
		System.out.print(n+" ");
		increasing(n+1);
	}
	public static void main(String[] args) {
		int n=1;
		increasing(1);
	}
}