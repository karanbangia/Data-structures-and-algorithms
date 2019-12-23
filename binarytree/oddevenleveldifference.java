class GfG
{   /*You are required to complete this function*/
    static int height(Node root)
    {
        if(root==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    int getLevelDiff(Node root)
    {
        if(root==null)return 0;
        int h=height(root);	
        int sumeven=0;
        int sumodd=0;
        int k=0;
        for(int i=0;i<h;i++)
        {
            if(i%2==0)
            {
                sum=0;
                getsum(root,i);
                sumodd+=sum;
            }
            else
            {   sum=0;
                getsum(root,i);
                sumeven+=sum;    
            }
            
        }
        return sumodd-sumeven;
        
        
    }
    static int sum=0;
    static void  getsum(Node root,int i)
    {
        
        if(root==null)return;
        if(i==0)
        {
            sum+=root.data;
            return;
        }
        getsum(root.left,i-1);
        getsum(root.right,i-1);
    }
}