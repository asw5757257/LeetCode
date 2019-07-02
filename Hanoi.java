package leetcode;

public class Hanoi {
	public static void move(int level,char from,char inter,char to)
	{
		if(level==1)
		{
			System.out.println("从"+from+"移动到"+to);
		}
		else {
			move(level-1,from,to,inter);
			System.out.println("从"+from+"移动到"+to);
			move(level-1,inter,from,to);
		}
	}
	public static void main(String args[])
	{
		int disk=3;
		move(disk,'A','B','C');
	}
}
