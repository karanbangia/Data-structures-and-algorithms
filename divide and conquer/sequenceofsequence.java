class sequenceofsequence
{
	static int sequence(int a,int b,int c)
	{
		if(b==0)
		{
			return 1;
		}
		if(b%2==0)
		{
			int d=sequence(a,b/2,c);
			return (d*d)%c;
		}

		return a*sequence(a,b-1,c);

	}
	public static void main(String[] args) {
		int a=7;
		int b=100;
		int c=5;
		System.out.println(sequence(a,b,c));
	}
}