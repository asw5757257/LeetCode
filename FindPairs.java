package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairs {
	
	  public static int findPairs(int[] nums, int k) 
	  { Arrays.parallelSort(nums); 
	  	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	  	
	  	int low= 0; 
	  	int num = 0;
	  	while(low<nums.length-1)
	  	{
	  		int high = low+1;
	  		while(high<nums.length)
	  		{
	  			if(nums[high]-nums[low]==k)
	  			{	
	  				map.put(nums[low],nums[high]);
	  			}
	  			high++;
	  		}
	  		low++;
	  	}
	  	
	  	return map.size();
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {1, 2, 3, 4, 5};
			System.out.println(findPairs(nums,1));
	}

}

