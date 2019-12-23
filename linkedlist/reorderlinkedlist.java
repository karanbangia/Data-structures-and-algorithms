{
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
	
public class ReorderList
{
    Node head;  // head of lisl
  
    /* Linked list Node*/
   
                    
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
     public void addToTheLast(Node node) {
  if (head == null) {
   head = node;
  } else {
   Node temp = head;
   while (temp.next != null)
    temp = temp.next;
   temp.next = node;
  }
 }
  /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			ReorderList llist = new ReorderList();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
         }
          //int k=sc.nextInt();
         
        llist.head = new gfg().reorderlist(llist.head);
        //llist.printList();
		//llist.head = llist.reverse(llist.head);
		llist.printList();
		
        t--;
    }
}
}
}
/*This is a function problem.You only need to complete the function given below*/
/* Following is the Linked list node structure */
/*class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}*/
	
class gfg
{
    Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node newnext=null;
        while(curr!=null)
        {
            newnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnext;
        }
        head=prev;
        return head;
    }
    Node reorderlist(Node head)
    {
        if(head==null)return null;
        if(head.next==null)return head;
        Node slow=head;
        Node fast=slow.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
        }
            Node node1=head;
            Node node2=slow.next;
            slow.next=null;
            node2=reverse(node2);
            Node x=new Node(0);
            Node curr=x;
            while(node1!=null || node2!=null)
            {
               if(node1!=null)
                {
                 curr.next=node1;
                 curr=curr.next;
                 node1=node1.next;
                }
                if(node2!=null)
                {
                 curr.next=node2;
                 curr=curr.next;
                 node2=node2.next;
                }
            }
            x=x.next;
            return x;
        }
        
    
}
