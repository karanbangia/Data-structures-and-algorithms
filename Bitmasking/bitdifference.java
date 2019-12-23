public class bitdifference
{
	public static void main(String[] args) {
		int a=5;
		int b=1;
		int c=a^b;
		int count=0;
		while(c>0)
		{
			count+=(c&1);
			c=c>>1;
		}
		System.out.print(count);
	}
}