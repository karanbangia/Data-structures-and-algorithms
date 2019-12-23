class stackusingarray
{	private int []data;
	private int top;
	public static final int DEFAULT_CAPACITY=10;
	public stackusingarray() throws Exception
	{
		this(DEFAULT_CAPACITY);
	}
	public stackusingarray(int capacity) throws Exception
	{
		if(capacity<1)
		{
			throw new Exception("Invalid capacity");
		}
		this.data=new int[capacity];
		this.top=-1;
	}
	
	public int size()
	{
		return this.top+1;
	}
	public boolean isEmpty()
	{
		return this.size()==0;
	}
	public void push (int val)throws Exception
	{
		if(this.size()==this.data.length)
		{
			throw new Exception("Stack is full");
		}
		this.top++;
		this.data[this.top]=val;

	}
	public int pop () throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("Stack is isEmpty");

		}
		int rv=this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return rv;
	}	
	public void display()
	{
		for (int i=this.top;i>=0 ;i-- ) {
			System.out.print(this.data[i]+" ");
		}
	}
	public void top()
	{
		System.out.println(this.data[this.top]);
	}

	public static void main(String[] args) throws Exception  {
		stackusingarray stack1=new stackusingarray(5);
		stackusingarray stack2=new stackusingarray(5);
		for(int i=0;i<5;i++)
		{
			stack1.push(i*10);
		}
		stack1.display();
		System.out.println();
		for(int i=0;i<5;i++)
		{
			stack2.push(stack1.pop());
		}
		stack2.display();
	}
}