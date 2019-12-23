class GFG
{
   static Node start=null;
   static int fromLast=0;
    Node swapkthnode(Node head, int num, int K)
    {
        if(head==null)
        {
            return null;
        }
        start=head;
       func(head,K);
       return head;
       
       
       
    }
    static void func(Node head,int K)
    {
        if(head==null)
        {
            return;
        }
        func(head.next,K);
        fromLast+=1;
        if(K==fromLast)
        {
            head.data=head.data^start.data;
            start.data=start.data^head.data;
            head.data=start.data^head.data;
            return;
        }
        start=start.next;
    }
   
}
