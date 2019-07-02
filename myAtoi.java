package leetcode;

import java.math.BigDecimal;
import java.util.Stack;

public class myAtoi {
	public static int myyAtoi(String str)
	{	int index=0;
		char fuhao='0';
		Stack<Integer> ss=new Stack<Integer>();
		if(str.length()==0)
			{
				return 0;
			}
		while(str.charAt(index)==' ')
		{
			index++;
		}
		if(index==str.length()-1)
		{
			return 0;
		}
		if(str.charAt(index)=='-'||str.charAt(index)=='+')
		{
			fuhao=str.charAt(index);
			index++;
		}
		if(str.charAt(index)>='0'&&str.charAt(index)<='9')
		{
			while(index<str.length())
			{
				if(str.charAt(index)>='0'&&str.charAt(index)<='9')
				{	
					ss.push(str.charAt(index)-'0');
					index++;
				}
				else {
					{
						break;
					}
				}
			}
		}
		else {
			return 0;
		}
		int kk=0;
		int max=0;
		while(!ss.empty())
		{
			max+=ss.peek()*Math.pow(10,kk);
			ss.pop();
			kk+=1;
		}
		if(fuhao=='-')
		{
			max=-max;
		}
		if(max==Math.pow(2,31)-1)
		{	
			return 2147483647;
			
		}
		if(max==-Math.pow(2,31)+1)
		{	
			return -2147483648;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String aString=new String("91283472332");
		long m=myyAtoi(aString);
		
		System.out.println(m);
		//System.out.println(m);
		
	}

}
