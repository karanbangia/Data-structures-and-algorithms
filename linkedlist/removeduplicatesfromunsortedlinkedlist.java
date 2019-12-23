
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

class GfG
{
    // Function to remove duplicates from the given linked list
    Node removeDuplicates(Node head)
    {
         LinkedHashSet<Integer> hs=new LinkedHashSet<>();
         Node temp1=head;
         while(temp1!=null)
         {
             hs.add(temp1.data);
             temp1=temp1.next;
         }
        Node res=null;
        Node temp=null;
         for(Integer i:hs)
         {
             Node nn=new Node(i);
            if(res==null)
            {
                res=nn;
                temp=nn;
            }
            else
            {
                res.next=nn;
                res=nn;
                
            }
            
             
         }
        
        return temp ;


    }
}
