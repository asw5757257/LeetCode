package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class BinaryTreePaths {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	static List<String> list = new ArrayList<>();
	static TreeNode first;
	public static List<String> binaryTreePaths(TreeNode root)
	{	
		dfs(root,"");
		return list;
	}
	public static void dfs(TreeNode root,String ss)
	{
		if(root==null)
		{
			return;
		}
		if(root==first)
		{
			ss=Integer.toString(root.val);
		}
		else {
			ss=ss+"->"+Integer.toString(root.val);
		}
		if(root.left==null&&root.right==null)
		{
			list.add(ss);
			
		}
		dfs(root.left, ss);
		dfs(root.right, ss);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
