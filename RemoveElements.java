package leetcode;

public class RemoveElements {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public static ListNode removeElements(ListNode head, int val) {
        ListNode p=head;
        while(p.next!=null)
        {
        	if(p.next.val==val)
        	{
        		p.next=p.next.next;
        	}
        	else {
        		{
        			p=p.next;
        		}
			}
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
