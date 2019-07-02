package leetcode;

public class ContainsNearbyDuplicate {
	public static boolean containsNearbyDuplicate(int[] nums, int k)
	{	boolean bool=false;
		if(k==0)
		{
		return true;
		}
		int i=0;int j=nums.length-1;
		while(i<j)
		{
			if(nums[i]==nums[j]&&Math.abs(i-j)==k)
			{
				bool=true;
				break;
			}
			else if(nums[i]<nums[j])
			{
				i++;
			}
			else if(nums[i]>nums[j])
			{
				j--;
			}
			else if(nums[i]==nums[j]&&Math.abs(i-j)!=k)
			{
				i++;
			}
		}
		return bool;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,1,2,3};
		int k=2;
		System.out.println(containsNearbyDuplicate(nums, k));
	}

}
