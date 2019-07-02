package leetcode;

import java.util.HashMap;
import java.util.Map;

/*给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。*/
public class CanConstruct {
	public static int firstUniqChar(String s) {
	       int[] dic = new int[26];

	            for(int i = 0;i < s.length(); i++)
	                dic[s.charAt(i)-'a']++;
	            	
	            for(int i = 0;i < 26; i++)
	               System.out.println(dic[i]);
	            for (int i = 0; i < s.length(); i++)
	                if (dic[s.charAt(i) - 'a'] == 1)
	                    return i;
	            return -1;
	    }
	static void main(String args[])
	{
		System.out.println(firstUniqChar("loveleetcode"));
	}
}
