package leetcode;

import java.util.HashMap;
import java.util.Map;

//给定两个字符串 s 和 t，判断它们是否是同构的。
//如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
//所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
public class IsIsomorphic {
	public static boolean isIsomorphic(String s,String t)
	{	boolean bool=true;
        Map<Character,Character> hashMap = new HashMap<Character, Character>();
        for(int i=0;i<s.length();i++)
        {	//System.out.println(hashMap.get(s.charAt(i)));
        	
        	//if(hashMap.containsValue(s.charAt(i)))
        	//{
        	for(char key:hashMap.keySet())
        	{	//System.out.println(key);
        		if(hashMap.get(key).equals(s.charAt(i)))
        		{	System.out.println(key);
        			if(key!=t.charAt(i));
        			bool=false;
        			break;
        		}
        	}
        	//}
        	if(hashMap.containsKey(s.charAt(i)))
        	{	
        		if(hashMap.get(s.charAt(i))!=t.charAt(i))
        		{	
        			bool=false;
        			break;
        		}
        	}
        	else {
        		{
        			hashMap.put(s.charAt(i),t.charAt(i));
        		}
			}
        	//System.out.println(hashMap);
        	
        }
        return bool;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab";
		String t="aa";
		System.out.println(isIsomorphic(s, t));
	}

}
