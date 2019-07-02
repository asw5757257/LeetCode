package leetcode;

public class FindMaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums)
	{	int n=0;
		int max=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==1)
			{
				n++;
			}
			if(nums[i]==0)
			{	if(max<n)
				{
				max=n;
				}
				n=0;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums= {1,0,1,1,0,1};
		int n=findMaxConsecutiveOnes(nums);
		System.out.println(n);
	}

}
