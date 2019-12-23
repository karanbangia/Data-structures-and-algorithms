class BST
{
	private class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	private Node root;
	public BST(int []arr)
	{
		this.root=construct(arr,0,arr.length-1);
	}
	private Node construct(int arr[],int low,int hi)
	{
		if(hi<low)
		{
			return null;
		}
		int mid=(low+hi)/2;
		Node nn=new Node(arr[mid]);
		
		nn.left=construct(arr,low,mid-1);
		nn.right=construct(arr,mid+1,hi);
		return nn;
	}
	public void display()
	{
		display(this.root);
	}
	private void display(Node node)
	{
		if(node==null)
		{
			return;
		}
		String str="";
		if(node.left == null)
		{
			str+=".";
		}
		else
		{
			str+=node.left.data;
		}
		if(node.right == null)
		{
			str+=".";
		}
		else
		{
			str+=node.right.data;
		}
		str+=" -> "+node.data+" <- ";
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	public void findKey(int key)
	{
		if(findKey(this.root,key))
		{
			System.out.println("key is present");
		}
		else
		{
			System.out.println("key is not present");
		}
	}
	private boolean findKey(Node node,int key)
	{
		if(key==node.data)
		{
			return true;
		}
		if(key<node.data)
		{
			return findKey(node.left,key);
		}
		if(key<node.data)
		{
			return findKey(node.right,key);
		}
		return false;
	}
	public void findMax()
	{
		System.out.println(findMax(this.root));
	}
	private int findMax(Node node)
	{
		if(node.right==null)
		{
			return node.data;
		}
		return findMax(node.right);
	}
	public void add(int key)
	{
		add(this.root,key);
	}
	private void add(Node node,int key)
	{
	
	
		if(key>node.data)
		{
			if(node.right==null)
			{
				Node nn=new Node(key);
				node.right=nn;
			}
			else
			{
				add(node.right,key);
			}
		}
		if(key<node.data)
		{
			if(node.left==null)
			{
				Node nn=new Node(key);
				node.left=nn;
			}
			else
			{
				add(node.left,key);
			}
		}
	}
	public void remove(int item)
	{
		remove(this.root,null,false,item);
	}
	private void remove(Node node,Node parent,boolean b,int item)
	{
		if(node==null)
		{
			return;
		}
		if(item>node.data)
		{
			remove(node.right,node,false,item);
		}
		else if(item<node.data)

			{
				remove(node.left,node,true,item);
			}
		else
		{
			if(node.left==null && node.right==null)
			{
				if(b)
				{
					parent.left=null;
				}
				else
				{
					parent.right=null;
				}
			}
			else if(node.left==null && node.right!=null)
			{
				if(ilc)
				{
					parent.left=node.right;
				}
				else{
					parent.right= node.right;
				}
			}
			else if(node.left!=null && node.right==null)
			{
				if(ilc)
				{
					parent.left=node.left;
				}
				else{
					parent.right= node.left;
				}
			}
			else
			{
				int max=max(node.left);
				node.data=max;
				remove(node.left,node,true,max);
			}


		}
	}

	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60,70};
		BST bst=new BST(arr);	
		// bst.findKey(100);
		// bst.findMax();
		bst.add(33);
		bst.display();
	}
}
