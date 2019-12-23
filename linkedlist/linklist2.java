		//remove waale
		class linklist2
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
			public int removeFirst() throws Exception
			{
				if(this.size==0)
				{
					throw new Exception("LL is empty");
				}
				int rv=this.head.data;
				if(this.size==1)
				{
					this.head=null;
					this.tail=null;
					this.size=0;
				}
				else
				{
					Node temp=this.head;
					Node x=temp.next;
					this.head=x;
					this.size--;
				}
				return rv;

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
			public int removeAt(int idx) throws Exception
			{	

				if(this.size==0)
				{
					throw new Exception("LL is empty");
				}
				Node x=getNodeAt(idx);
				Node y=x.next;
				int rv=x.data;
				if(this.size==1)
				{
					return removeFirst();
				}
				if(idx==this.size-1)
				{
					return removeLast();
				}
				else
				{
					Node previous=getNodeAt(idx-1);
					previous.next=y;
					this.size--;
				}
				return rv;

			}
			public void reverseData() throws Exception
			{
				int left=0;
				int right=this.size-1;
				while(left<right)
				{
					Node ln=getNodeAt(left);
					Node rn=getNodeAt(right);
					int temp=ln.data;
					ln.data=rn.data;
					rn.data=temp;
					left++;
					right--;

				}
			}
			public void reversePointers()
			{

				Node prev=this.head;
				Node curr=head

				while(curr!=null)
				{
					Node ahead=curr.next;
					curr.next=prev;
					prev=curr;
					curr=ahead;

				}
				Node t=this.head;
				this.head=this.tail;
				this.tail=t;
				this.tail.next=null;

			}

			public static void main(String[] args) throws Exception {

				// ob1.addfirst(10);
				// ob1.addfirst(20);
				// ob1.addfirst(30);
				// ob1.addfirst(40);
				// ob1.addfirst(50);
				// ob1.removeFirst();
				// ob1.display();

				linklist2 ob2=new linklist2();
				ob2.addlast(10);
				ob2.addlast(20);
				ob2.addlast(30);
				ob2.addlast(40);
				ob2.addlast(50);
				ob2.display();
				// System.out.println();
				// ob2.removeAt(1);
				// System.out.println();
				// ob2.display();
				ob2.reversePointers();
			    System.out.println();
				ob2.display();



			}
		}
