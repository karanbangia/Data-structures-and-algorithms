class GfG{
    public int sum(Node root)
    {
        if(root==null)return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
   public int tilt(Node root)
   {
       if(root==null)return 0;
       return Math.abs(sum(root.left)-sum(root.right))+tilt(root.left)+tilt(root.right);
   }
}