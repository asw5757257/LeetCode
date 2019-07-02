package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class LevelOrder {
	public List<List<Integer>> levelOrder(Node root)
	{	List<List<Integer>> totaList = new ArrayList<List<Integer>>();
	
	List<Node> list = new ArrayList<Node>();
		Queue<Node> stack = new LinkedList<Node>();
		stack.add(root);
		while(stack.isEmpty()!=true)
		{	List<Integer> ll = new ArrayList<Integer>();
			list.clear();
			while(stack.isEmpty()!=true)
			{	
				list.add(stack.peek());
				ll.add(stack.peek().val);
				stack.poll();
			}
			for(int i=0;i<list.size();i++)
			{
				for(int j=0;j<list.get(i).children.size();j++)
				{
					stack.add(list.get(i).children.get(j));
				}
			}
			totaList.add(ll);
		}
		return totaList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
