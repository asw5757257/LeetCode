package leetcode;
//����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
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
		// TODO �Զ����ɵķ������
		int[] nums= {-1};
		int pos=singleNumber(nums);
		System.out.println(pos);
	}

}
