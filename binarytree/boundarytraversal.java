class GfG
{   
    void leftwala(Node root)
    {
        if(root==null)return;
        if(root.left==null && root.right==null)return ;
        System.out.print(root.data+" ");
        leftwala(root.left);
        if(root.left==null && root.right!=null)
        {
            leftwala(root.right);
        }
    }
    void bottomwala(Node root)
    {
        if(root==null)return;
        if(root.left==null && root.right==null)
        {
            System.out.print(root.data+" ");
        }
        bottomwala(root.left);
        bottomwala(root.right);
    }
    void rightwala(Node root)
    {
        if(root==null)return;
        if(root.left==null && root.right==null)return ;
        rightwala(root.right);
         if(root.left!=null && root.right==null)
        {
            rightwala(root.left);
        }
        System.out.print(root.data+" ");
        
    }
    
	void printBoundary(Node node)
	{
	    if(node==null)return;
	    System.out.print(node.data+" ");
		leftwala(node.left);
		bottomwala(node);
		rightwala(node.right);
		
	}
}