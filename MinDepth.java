package leetcode;

//import javax.swing.tree.TreeNode;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class MinDepth {
	public  static int MinDepth(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		TreeNode t=new TreeNode(Integer.MAX_VALUE);
		depth(root,t,1);
		return t.val;
		
	}
	
	public static void depth(TreeNode root,TreeNode t,int level)
	{	if(root==null)
	{
		return;
	}
		if(root.right==null&&root.left==null&&level<t.val)
		{
			t.val=level;
		}
		depth(root.left,t, level+1);
		depth(root.right, t, level);
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
