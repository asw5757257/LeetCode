package leetcode;
//给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
public class haspathnum {
	class Solution {
	    public boolean hasPathSum(TreeNode root, int sum) {
	        if(root==null&&sum!=0)
	        {
	            return false;
	        }
	        TreeNode t=new TreeNode(0);
	        depth(root,t,sum,0);
	        if(t.val==0)
	        {
	            return false;
	        }
	        else
	        {
	            return true;
	        }
	    }
	    public void depth(TreeNode root,TreeNode t,int sum,int num)
	    {
	        if(root==null)
	        {
	            return;
	        }
	        num+=root.val;
	        if(num==sum&&root.left==null&&root.right==null)
	        {
	            t.val=1;
	        }
	        depth(root.left,t,sum,num);
	        depth(root.right,t,sum,num);
	    }
	}
}
