/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
class GfG
{
    // head: head node
    Node removeDuplicates(Node head)
    {
        if(head==null)
        {
            return null;
        }
	    
	    if(head.next==null)
	    {
	        return head;
	    }
	    Node first=head;
	    Node second=head.next;
	    Node x=first;
	    while(second!=null)
	    {
	        if(first.data==second.data)
	        {
	            while( second.next!=null  && second.next.data==first.data)
	            {
	                second=second.next;
	                
	            }
	            first.next=second.next;
	            second=second.next;
	        }
	        first=first.next;
	        try
	       { second=second.next;}
	       catch(Exception e)
	       {
	          return x; 
	       }
	    }
	    return x;
    }
}
