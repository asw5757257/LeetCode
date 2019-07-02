package leetcode;

public class CountPrimes {
	public static int countPrimes(int n) {
        int num=0;
        for(int j=2;j<n;j++)
        {
        	if(iszhishu(j)==true)
        	{
        		num++;
        	}
        }
        return num;
    }
	public static boolean iszhishu(int num)
	{
		for(int i=2;i<num/2+1;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public boolean isDual(int num){
		String ss = String.valueOf(num);
		char lastNum = ss.getBytes(ss.length());
		return (int)lastNum%2 == 0 || lastNum%5 == 0 ? false : true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		//System.out.println(countPrimes(10));
		countPrimes(10);
	}
	

}
