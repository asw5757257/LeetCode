package leetcode;
//����һ����������һ��Ŀ��ͣ��жϸ������Ƿ���ڸ��ڵ㵽Ҷ�ӽڵ��·��������·�������нڵ�ֵ��ӵ���Ŀ��͡�
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
