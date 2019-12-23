class cons
{
	int x;
	int y;
	cons(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class dailycodinginterview
{
	static int car(cons ob)
	{
		return ob.y;
	}
	static int cdr(cons ob)
	{
		returnxx ob.x;
	}
	public static void main(String[] args) {
		
		cons object=new cons(3,4);
		System.out.println("fist element is : "+car(object));
		System.out.println("second element is : "+cdr(object));
	}
}