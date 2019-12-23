
class xyz
{

	xyz()
	{
		this(10);
		System.out.println("hello");
	}
	xyz(int a)
	{
		this();
		System.out.println("parameterized constructor");
	}
	public static void main(String[] args) {
		xyz ob=new xyz();
		
	}
}