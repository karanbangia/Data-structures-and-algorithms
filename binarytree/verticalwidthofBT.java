class Tree
{
    public static void calc(Node root,HashSet<Integer> hs,int hd)
    {
        if(root==null)return;
        calc(root.left,hs,hd-1);
        hs.add(hd);
        calc(root.right,hs,hd+1);
    }
    public static int verticalWidth(Node root)
	{
	    HashSet<Integer> hs=new HashSet<>();
	    calc(root,hs,0);
	    return hs.size();
	}
}
