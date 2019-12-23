
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
class GfG
{
    static int count=0;
    int countLeaves(Node node) 
    {
       if(node==null)return 0;
       if(node.left==null && node.right==null)return 1;
       return (countLeaves(node.right)+countLeaves(node.left));
    }
   
}
