package leetcode;
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
public class SingleNumber {
	public static int singleNumber(int[] nums)
	{	
		int len=nums.length;
		int result=0;
		for(int i=0;i<len;i++)
		{
			result=result^nums[i];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums= {-1};
		int pos=singleNumber(nums);
		System.out.println(pos);
	}

}
