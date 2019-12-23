/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    void leftView(Node root)
    {
        if(root==null)return;
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      Node x=null;
      while(!q.isEmpty())
      {
          int size=q.size();
          for(int i=0;i<size;i++)
          {
               x=q.poll();
              if(i==0)
              {
                 
                  System.out.print(x.data+" ");
              }
             
        if(x.left!=null)q.add(x.left);
          if(x.right!=null)q.add(x.right);
              
          }
         
      }
      
    }
}
