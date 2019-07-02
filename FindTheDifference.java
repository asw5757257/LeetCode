package leetcode;

public class FindTheDifference {
	 public static char findTheDifference(String s, String t) {
	        char index='1';
	        int[] a=new int[26];
	        int[] b=new int[26];
	        for(int i=0;i<s.length();i++)
	        {
	            a[s.charAt(i)-'a']++;
			
	        }
	       
	        for(int i=0;i<t.length();i++)
	        {
	            b[t.charAt(i)-'a']++;
	        }
	        for(int i=0;i<26;i++)
	        {
	        	if(b[i]>a[i])
	        	{
	        		index=(char)(i+97);
	        	}
	        }	
	        return index;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = findTheDifference("abcd","abcde");
		System.out.println(ch);
	}

}
