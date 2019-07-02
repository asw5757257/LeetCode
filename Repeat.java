package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Repeat {
	 public static boolean repeatedSubstringPattern(String s) {
	        int[] nums = new int[26];
	        for(int i=0;i<s.length();i++)
	        {
	            nums[s.charAt(i)-97]++;
	        }
	        boolean bool = true;
	        int n=nums[s.charAt(0)-97];
	        for(int i=0;i<26;i++)
	        {
	            if(nums[i]!=0)
	            {
	                if(nums[i]!=n)
	                {
	                    return false;
	                }
	            }
	        }
	        int k=s.length()/n;
	        int high=k;
	        int index=0;
	        List<String> list = new ArrayList<>();
	        while(high<=s.length())
	        {
	            list.add(s.substring(index,high));
	            index+=k;
	            high+=k;
	        }
	        for(int i=0;i<list.size()-1;i++)
	        {	System.out.println(list.get(i));
	            if(list.get(i).equals(list.get(i+1))==false)
	            {	
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		String string="abaababaab";
		System.out.println(repeatedSubstringPattern(string));

	}

}
