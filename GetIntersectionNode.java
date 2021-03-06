package leetcode;

public class GetIntersectionNode {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
	public ListNode getIntersectionNode(ListNode headA, ListNode headB)
	{
		ListNode p = headA;
		ListNode q = headB;
		while(p!=q)
		{
			p=p==null?headB:p.next;
			q=q==null?headA:q.next;
		}
		return p;
	}
}
