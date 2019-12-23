static int findCousin(Node root,int k)
{
	if(root==null)return -1;
	if(root.data==k)return -1;
	int curr_sum=0;
	Queue<Node> q=new LinkedList<>();
	q.add(root);
	int size;
	boolean found=false;
	while(!q.isEmpty())
	{
		if(found==true)return curr_sum;
		size=q.size();
		while(size>0)
		{
			root=q.peek();
			q.remove();
			curr_sum=0;
			if((root.left!=null && root.left.data==k)|| (root.right!=null && root.right.data==k))
			{
				found=true;
			}
			else
			{
				if(root.left!=null)
				{
					curr_sum+=root.left.data;
					q.add(root.left);
				}
				if(root.right!=null)
				{
					curr_sum+=root.right.data;
					q.add(root.right);
				}
			}

		}
	}
}
HashMap<Integer,Integer> depth
HashMap<Integer,Node> parent
int sumall;
int sumcounsins(Node root,int k)
{
	if(root==null)return -1;
	if(root.data==k)return -1;
	 depth=new HashMap<>();
	 parent=new HashMap<>();
	dfs(root,null,k);
	int depthofk=depth.get(k);
	sum(root,depthofk);
	return sumall;
}

void sum(Node root,int i,k)
{
	if(root==null)return;
	if(i==0)
	{
		if(parent.get(root)!=parent.get(k))
		{
			sumall+=root.data;
		}
	}
	sum(root.left,i-1,k);
	sum(root.right,i-1,k);
}
void dfs(Node root,Node par)
{
	if(root==null)return;
	if(par==null)
	{
		depth.put(root.data,0);
		parent.put(root.data,par);
	}
	depth.put(1+depth.get(par),root.data);
	parent.put(root.data,par);
	dfs(root.left,root);
	dfs(root.right,root);



}