{
// INITIAL CODE
import java.util.*;
import java.lang.*;
import java.io.*;
// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Is_BinaryTree_MaxHeap
{
	void inorder(Node node)
	{
		if(node==null)
			return ;
		else
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
			
					
	}
	
    // driver function to test the above functions
    public static void main(String args[])
    {
		Is_BinaryTree_MaxHeap CLN = new Is_BinaryTree_MaxHeap();
		//Index index_obj = new Index();
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0)
            {	
			
				int n1 = sc.nextInt();
                int n2 = sc.nextInt();
				char lr= sc.next().charAt(0);
				
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
			
            GfG g = new GfG();
			
			boolean res = g.isHeap(root);
			if(res == true)
			System.out.println(1);
			else 
			System.out.println(0);
			//CLN.inorder(root);
			 t--;
			// System.out.println();
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
/*
A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG
{
    /*You are required to complete this method */
    boolean isHeap(Node tree)
    {
        if(tree==null)return true;
        if(tree.left==null && tree.right==null)return true;
        if(tree.left!=null && tree.right==null)
        {
            if(tree.left.data<tree.data)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
         if(tree.left==null && tree.right!=null)
        {
            if(tree.right.data<tree.data)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
	   if(tree.left.data<tree.data && tree.right.data<tree.data)
	   {
	       return (isHeap(tree.left) && isHeap(tree.right));
	   }
	   return false;
    }
}