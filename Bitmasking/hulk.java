public class hulk
{
	static int basicapproach(int no)
	{
		while(no>0)
		{	count+=(no&1);
			no=no>>1;

		}
	}
	static int advanceapproach(int no)
	{
		while(no>0)
		{
			no=no&(no-1);
			count ++;
		}
	}
	public static void main(String[] args) {
		int no=13;
		int count=0;
		// choose your approach
		
		System.out.print(count);
	}
}