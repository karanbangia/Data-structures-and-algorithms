/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
   public ListNode loop(ListNode p,ListNode head)
    {
        while(p!=head)
        {
            p=p.next;
            head=head.next;
        }
        return p;
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode p=head;
        ListNode q=head;
        while(p!=null && q!=null && q.next!=null)
        {
            p=p.next;
            q=q.next.next;
            if(p==q)
            {
               return loop(p,head); 
            }
        }
        return null;
        
    }
}