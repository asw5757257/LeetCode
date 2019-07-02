package leetcode;

import java.util.ArrayList;
import java.util.List;

//一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和
//，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。
//如果可以变为 1，那么这个数就是快乐数。
public class IsHappy {
	public static boolean ishappy(int n)
	{	int nn=0;
		List<Integer> kk = new ArrayList<>();
		kk.add(n);
		boolean b=false;
		while(true)
		{
			while(n!=0)
			{
				nn+=Math.pow(n%10,2);
				n=n/10;
			}
			n=nn;
			System.out.print(n+"\n");
			nn=0;
			
			if(kk.contains(n))
			{	
				b=false;
				break;
			}
			if(n==1)
			{
				b=true;
				break;
			}
			kk.add(n);
		}
			return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		ishappy(n);
	}

}
