import java.util.*;
class binarytree
{
	private class Node
	{
		int data;
		Node left;
		Node right;
		Node(int val,Node left,Node right)
		{
			this.right=right;
			this.left=left;
			this.data=val;
		}
	}
	private Node root=null;
	private int size=0
	binarytree()
	{
		Scanner s=new Scanner(System.in);
		this.root=takeInput(s,null,false);

	}
	private Node takeInput(Scanner s,Node parent,boolean isLeftorRight)
	{
		if(parent==null)
		{
			System.out.println("enter the data for root node");
		}
		else
		{
			if(isLeftorRight)
			{
				System.out.println("enter the data for left child of the node");
			}
			else
			{
				System.out.println("enter the data for right child of the node");	
			}
		}

			int nodeData=s.nextInt();
			Node node=new Node(nodeData,null,null);
			this.size++;
			boolean choice=false;
			System.out.println("Do you have left child of"+node.data);
			choice=s.nextBoolean();
			if(choice)
			{
				node.left=takeInput(s,parent,true);
				}
			boolean choice=false;;
			System.out.println("Do you have right child of"+node.data);
			choice=s.nextBoolean();
			if(choice)
			{
				node.right=takeInput(s,parent,false);
			}
			return node;


	}
	public void display()
	{
		this.display(this.root);
	}
	private void display(Node node){
		String str=""
		if(node.left!=null)
		{
			str=str+node.left.data+"=>";

		}
		else

		{
			str=str+"=>";
		}
		str=str+"E"
	}
}