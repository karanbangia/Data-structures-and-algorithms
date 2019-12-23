/*
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
*/
class Spiral
{
      void printSpiral(Node node) 
      {
           
          if(node==null)return;
          Stack<Node> even=new Stack<>();
          Stack<Node> odd=new Stack<>();
          even.push(node);
          while(!even.isEmpty() || !odd.isEmpty())
          {
              while(!even.isEmpty())
              {
                  Node x=even.pop();
                  System.out.print(x.data+" " );
                  if(x.right!=null)
                  {
                      odd.push(x.right);
                  }
                  if(x.left!=null)
                  {
                      odd.push(x.left);
                  }
                  
              }
              while(!odd.isEmpty())
              {
                  Node y=odd.pop();
                  System.out.print(y.data+" " );
                  if(y.left!=null)
                  {
                      even.push(y.left);
                  }
                  if(y.right!=null)
                  {
                      even.push(y.right);
                  }
                  
              }
          }
           
      }
}
