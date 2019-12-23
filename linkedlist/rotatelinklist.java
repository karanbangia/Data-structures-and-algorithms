class rotatelinkist
{
	private class Node
	{
		int data;
		Node next;
		Node(int val)
		{
			this.data=val;
			next=null;
		}
	}
	private Node head;
	private Node tail;
	private int size=0;

	public void addlast(int val)
	{
		Node nn=new Node(val);
		if(this.size>=1)
		{
			this.tail.next=nn;

		}
		if(this.size==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else
		{
			this.tail=nn;
			this.size++;
		}

	}
	public void display()
	{	Node temp=this.head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	private Node getNodeAt(int idx) throws Exception
	{
		Node temp=this.head;
		if(size==0)
		{
			throw new Exception("LL is empty");
		}
		if(idx>size-1 || idx<0)
		{
			throw new Exception("index out of bounds ");	
		}
		for(int i=1;i<=idx;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public int removeLast() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("LL is empty");
		}
		int rv=this.tail.data;
		if(this.size==1)
		{
			this.head=null;
			this.tail=null;
			this.size=0;
		}
		else
		{
			Node secondLast=getNodeAt(size-2);
			secondLast.next=null;
			this.tail=secondLast;
			this.size--;
		}
		return rv;

	}
	public void  addfirst(int val)
	{
		Node nn=new Node(val);
		if(this.size>=1)
		{
			nn.next=head;

		}
		if(this.size==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else
		{
			this.head=nn;
			this.size++;
		}
	}
	public static void main(String[] args) throws Exception {
		rotatelinkist ob=new rotatelinkist();
		ob.addlast(10);
		ob.addlast(20);
		ob.addlast(30);
		ob.addlast(40);
		ob.addlast(50);
		ob.addlast(60);
		int k=4;
		for(int i=0;i<4;i++)
		{
			int x=ob.removeLast();
			ob.addfirst(x);
		}
		ob.display();
	}
}