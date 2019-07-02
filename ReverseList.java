package leetcode;

public class ReverseList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public ListNode reverseList(ListNode head)
	{
		ListNode begin = new ListNode(-1);
		begin.next=head;
		ListNode p = head;
		ListNode q = head.next;
		while(q!=null)
		{
			p.next=q.next;
			q.next=begin.next;
			begin.next=q;
			q=p.next;
		}
		return begin.next;
	}
}
