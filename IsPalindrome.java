package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//�жϻ����� ֻ����Ӣ�ĺ����� �����ǿո�
public class IsPalindrome {
	public static boolean isPalindrome(String s)
	{	boolean bool=true;
		Stack<Character> ss=new Stack<>();
		Queue<Character> qq=new LinkedList<>();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{	if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='0'&&ch[i]<='9')
			{
				ss.push(ch[i]);
				qq.add(ch[i]);
			}
		}
		while(!ss.empty())
		{	//System.out.println("ջ"+ss.peek()+"����"+qq.peek());
			if(ss.peek()!=qq.peek())
			{
				bool=false;
			}
			ss.pop();
			qq.poll();
		}
		return bool;
		
		
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String ss="A man, a plan, a canal: Panam";
		boolean ch=isPalindrome(ss);
		//char a='a';
		System.out.println(isPalindrome(ss));
		
	}

}
