package leetcode;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ContainsDuplicate {
	 public static boolean containsDuplicate(int[] nums) 
	 {	boolean bool=false;
	    Arrays.sort(nums);    
	    for(int i=0;i<nums.length-1;i++)
	    {
	    	if(nums[i]==nums[i+1])
	    	{
	    		bool=true;
	    		break;
	    	}
	    }
	    return bool;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nn={1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nn));
	}

}
