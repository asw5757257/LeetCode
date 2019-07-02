package leetcode;

import java.util.LinkedList;
import java.util.Queue;


public class PathSum {
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	static int total=0;
	 public static int pathSum(TreeNode root, int sum)
	 {		if(root==null)
	 	{
		 return 0;
	 	}
	 	Sum(sum, root);
	 	pathSum(root.left,sum);
	 	pathSum(root.right, sum);
		 
		 
		 
	 }
	 public static void Sum(int sum,TreeNode root)
	 {
		 if(root==null)
		 {
			 return;
		 }
		 sum-=root.val;
		 if(sum==0)
		 {
			 total++;
		 }
		 Sum(sum,root.left);
		 Sum(sum, root.right);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
