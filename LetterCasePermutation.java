package leetcode;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LetterCasePermutation {
	public static void letterCasePermutation(char[] ch,LinkedList<String> res,int i)
	{	if(i==ch.length) 
		{
		res.add(new String(ch));
		return;
		}
	
			char c=ch[i];
			if(ch[i]>='a'&&ch[i]<='z')
			{	
				ch[i]=(char)(ch[i]-32);
				letterCasePermutation(ch, res, i+1);
				ch[i]=c;
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
				letterCasePermutation(ch, res, i+1);
				ch[i]=c;
			}
			//res.add(ch.toString());
		
			letterCasePermutation(ch, res, i+1);
		
		
		
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String string="a1b2";
		char[] ch=string.toCharArray();
		LinkedList<String> reStrings=new LinkedList<String>();
		letterCasePermutation(ch,reStrings,0);
		for(String s:reStrings)
		{
			System.out.println(s);
		}
		
	}

}
