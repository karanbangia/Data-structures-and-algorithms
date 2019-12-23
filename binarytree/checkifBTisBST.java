/*  A Binary Search Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    int isBST(Node root)  
    {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
  
        if(isBST(root,min,max))
        {
            return 1;
        }
        return 0;
    }
    static boolean isBST(Node root,int min,int max)
    {
        if(root==null)return true;
        if(root.data>min && root.data<max)
        {
             if(isBST(root.left,min,root.data)&&isBST(root.right,root.data,max))
            {
                return true;
            }
        }
       
        return false;
    }
}
