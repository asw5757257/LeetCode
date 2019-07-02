package leetcode;

import java.util.ArrayList;

public class permuteUnique {
	public static void c(int level,ArrayList<ArrayList<Integer>> lists,int[] nums,ArrayList<Integer> list )
	{
		if(level==nums.length)
		{
			lists.add(new ArrayList<>(list));
			//return;
		}
		else {
			for(int i=0;i<nums.length;i++)
			{
				if(i!=level&&nums[level]==nums[i])
				{
					continue;
				}
				
				//System.out.print(nums[i]);
				c(level+1, lists, nums, list);
				//list.remove(list.size()-1);
				//index--;
			}
			//System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>> permutes(int[] nums) {
		ArrayList<ArrayList<Integer>> res  = new ArrayList<>();
        ArrayList<Integer> board = new ArrayList<>();
        c(0, res, nums, board);
        return res;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums= {1,1,2};
		ArrayList<ArrayList<Integer>> k=permutes(nums);
		for(ArrayList<Integer> s:k)
		{
			System.out.println(s);
		}
		
	}
}
