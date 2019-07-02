package leetcode;

import javax.print.attribute.standard.NumberUpSupported;

public class NumArray {
	public static int[] sums;
	public NumArray(int[] nums) {
        int[] sums=new int[nums.length+1];
        if(nums.length==0)
        {
        	return;
        }
        sums[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
        	sums[i]=sums[i-1]+nums[i];
        }
    }
    
    public static int sumRange(int i, int j) {
        if(i==0)
        {
        	return sums[j];
        }
        else {
        	return sums[j]-sums[i-1];
        }
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	}

}
