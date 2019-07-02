package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//判断回文数 只考虑英文和数字 不考虑空格
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
		{	//System.out.println("栈"+ss.peek()+"队列"+qq.peek());
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
		// TODO 自动生成的方法存根
		String ss="A man, a plan, a canal: Panam";
		boolean ch=isPalindrome(ss);
		//char a='a';
		System.out.println(isPalindrome(ss));
		
	}

}
