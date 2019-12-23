	//add wale
	class linklist
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
		public int getFirst() throws Exception
		{
			if(size==0)
			{
				throw new Exception("LL is empty");
			}
			return this.head.data;
		}
		public int getLast() throws Exception
		{
			if(size==0)
			{
				throw new Exception("LL is empty");
			}
			return this.tail.data;
		}
		public int getAt(int idx) throws Exception
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
			for(int i=0;i<=idx;i++)
			{
				temp=temp.next;
			}
			return temp.data;
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
		public void addAt(int idx,int val) throws Exception
		{
			Node newnode= new Node(val);
			if(idx==0)
			{
				addfirst(val);
			}
			else if(idx==this.size)
			{
				addlast(val);	
			}
			else
			{
				Node x=getNodeAt(idx-1);
				Node y=x.next;
				x.next=newnode;
				newnode.next=y;
				size++;
			}

			}
			public static void main(String[] args) throws Exception {
				linklist ob1=new linklist();

				ob1.addfirst(10);
				ob1.addfirst(20);
				ob1.addfirst(30);
				ob1.addfirst(40);
				ob1.addfirst(50);
			// ob1.display();

				linklist ob2=new linklist();
				ob2.addlast(10);
				ob2.addlast(20);
				ob2.addlast(30);
				ob2.addlast(40);
				ob2.addlast(50);
			// ob2.display();
			// System.out.println(ob2.getFirst());
				ob2.addAt(5,35);
				ob2.display();


			}
		}