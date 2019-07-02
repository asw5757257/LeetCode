package leetcode;
//����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�ÿ�䷿�ڶ�����һ�����ֽ�Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ��
//����������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������
//����һ������ÿ�����ݴ�Ž��ķǸ��������飬�������ڲ���������װ�õ�����£��ܹ�͵�Ե�����߽�
public class Rob {
	public static int rob(int[] nums)
	{	
		if(nums.length==0)
		{
			return 0;
		}
		if(nums.length==1)
		{
			return nums[0];
		}
		if(nums.length==2)
		{
			return Math.max(nums[0],nums[1]);
		}
		
		int[] kk=new int[nums.length+1];
		kk[0]=nums[0];
		kk[1]=Math.max(nums[0],nums[1]);
		//kk[3]=Math.max(Math.max(nums[0],nums[1]),nums[2]);
		for(int i=2;i<nums.length;i++)
		{
			kk[i]=Math.max(kk[i-2]+nums[i],kk[i-1]);
			//System.out.println(kk[i]);
		}
		return kk[nums.length-1];
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums= {2,7,9,3,1};
		int k=rob(nums);
		System.out.println(k);
	}

}
