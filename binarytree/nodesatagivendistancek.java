
class GFG
{
     
    public static ArrayList<Integer> printkdistanceNode(Node root, Node target ,int k)
    {   
        if(root==null)return -1;
        if(k==0)return target.data;
        HashMap<Node,Node> parent=new HashMap<>();
        dfs(root,null,parent);
        ArrayList<Integer> al;
        al=bfs(root,target,k,parent);
        if(al.size()==0)
        {
            return -1;
        }
        return al;
        
    }
    public static ArrayList<Integer> bfs(Node root,Node target,int k,HashMap<Node,Node> parent)
    {
        HashMap<Node,Boolean> visited=new HashMap<>();
        int distance[]=new int[101];
        Queue<Node> q=new LinkedList<>();
        q.add(target);
        visited.put(target,true);
        ArrayList<Integer> al=new ArrayList<>();
        while(!q.isEmpty())
        {
          Node rv=q.remove();
          if(distance[rv.data]==k)
          {
              al.add(rv.data);
          }
          if(root.left!=null)
          {
              if(!visited.get(root.left))
              {
                  visited.put(root.left,true);
                  distance[root.left.data]=distance[rv.data]+1;
              }
          }
           if(root.right!=null)
          {
              if(!visited.get(root.right))
              {
                  visited.put(root.right,true);
                  distance[root.right.data]=distance[rv.data]+1;
              }
           }
           if(parent.get(root)!=null)
           {    
               Node p=parent.get(root);
               if(!visited.get(p))
               {
                   visited.put(p,true);
                   distance[p.data]=distance[rv.data]+1;
               }
               
           }
        }
        return al;
    }

        public static void dfs(Node root,Node par,HashMap<Node,Node> parent)
        {
            if(root==null)return;
            if(par==null)
            {
                parent.put(root,null);
            }
            else
            {
                 parent.put(root,par);
            }
            dfs(root.left,root,parent);
            dfs(root.right,root,parent);
        }
}