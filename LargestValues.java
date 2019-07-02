package leetcode;

import java.util.List;
import java.util.Stack;

public class LargestValues {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	class Solution {
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    	TreeNode qNode = null;
	        if(p.val<=root.val&&q.val>=root.val||p.val>=root.val&&q.val<=root.val)
	        {
	            qNode= root;
	        }
	        if(p.val<root.val&&q.val<root.val)
	        {
	            return lowestCommonAncestor(root.left,p,q);
	        }
	        if(p.val>root.val&&q.val>root.val)
	        {
	            return lowestCommonAncestor(root.right,p,q);
	        }
			return qNode;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
