class midpointlinklist
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
			public int midpoint()
			{
				Node slow=this.head;
				Node fast=this.head;

				while(fast.next.next !=null && fast.next !=null)
				{
					slow=slow.next;
					fast=fast.next.next;
					
				
				}
				return slow.data;
			}

			public static void main(String[] args) {
				midpointlinklist ob=new midpointlinklist();
				ob.addlast(10);
				ob.addlast(20);
				ob.addlast(30);
				ob.addlast(40);
				ob.addlast(50);
				ob.display();
				System.out.println(ob.midpoint());
				
			}
}