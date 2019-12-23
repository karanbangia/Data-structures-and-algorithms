class GfG
{
    public void diagonalsum(Node root)
     {
         if(root==null)return;
      HashMap<Integer,Integer> map=new HashMap<>();
     // ll.add(0,root.data);
      diagonal(root,0,map);
      map.forEach((k,v)->{
          System.out.print(v+" ");
      });
    //   System.out.println();
     }
     public void diagonal(Node root,int i,HashMap<Integer,Integer> map)
     {
         if(root==null)
         return;
         if(map.containsKey(i))
         {
             Integer t=map.get(i);
             map.put(i,t+root.data);
         }
         else{
             map.put(i,root.data);
         }
         diagonal(root.left,i+1,map);
         diagonal(root.right,i,map);
         
     }
}
class GfG
{
    public void diagonalsum(Node root)
     {
         if(root==null)return;
     LinkedList<Integer> ll=new LinkedList<>();
     // ll.add(0,root.data);
      diagonal(root,0,ll);
      for(Integer i:ll)
      {
          System.out.print(i+" ");
          
      }

     }
     public void diagonal(Node root,int i,LinkedList<Integer> ll)
     {
         if(root==null)return;
         if(ll.size()-1<i)
         {
             ll.add(i,root.data);
         }
         else
         {
                int data=ll.get(i);
                ll.remove(i);
                ll.add(i,data+root.data);
         }
         diagonal(root.left,i+1,ll);
         diagonal(root.right,i,ll);
         
     }
}   