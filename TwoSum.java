package leetcode;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target)
	{	int[] num=new int[2];
		int i=0;int j=numbers.length-1;
		while(i<j)
		{
			if(numbers[i]+numbers[j]>target)
			{
				j--;
			}
			if(numbers[i]+numbers[j]<target)
			{
				i++;
			}
			if(numbers[i]+numbers[j]==target)
			{
				num[0]=i+1;
				num[1]=j+1;
				break;
			}
		}
		return num;
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] k= {1,2,3,4,5,6 ,7, 11, 15};
		int[] mm=twoSum(k,18);
		System.out.println(mm[0]+","+mm[1]);
	}
 
}
