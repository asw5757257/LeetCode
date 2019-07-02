package leetcode;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class LongestPalindrome {

	public static int longestPalindrome(String s) {
		int sum=0;
		int jishu=1;
        int[] num=new int[58];
        for(int i=0;i<s.length();i++)
        {
        	num[s.charAt(i)-64]++;
        }
        for(int j=0;j<58;j++)
        {
        	if(num[j]!=0&&num[j]%2==0)
        	{
        		sum+=num[j];
        	}
        	if(num[j]%2==1)
        	{
        		if(num[j]>jishu)
        		{
        			jishu=num[j];
        		}
        	}
        }
        return sum+jishu;
    }
	public static void main(String[] args) {
		String s = "abccccdd";
		System.out.println(longestPalindrome(s));
        
		
	}
	
}