package leetcode;

import java.util.ArrayList;

import javax.sound.sampled.Line;

//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
public class Generate {
	public static ArrayList<ArrayList<Integer>> generate(int numRows)
	{
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		for(int i=1;i<=numRows;i++)
		{
			line(list,i);
		}
		return list;
	}
	public static void line(ArrayList<ArrayList<Integer>> list,int i)
	{
		int[] num=new int[i];
		ArrayList<Integer> list2=new ArrayList<>();
		num[0]=1;
		list2.add(num[0]);
		
		
		for(int j=1;j<i-1;j++)
		{
			num[j]=list.get(i-2).get(j-1)+list.get(i-2).get(j);
			list2.add(num[j]);
		}
		if(i>1)
		{
			num[i-1]=1;
			list2.add(num[i-1]);
		}
		list.add(list2);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num=6;
		ArrayList<ArrayList<Integer>> list=generate(num);
		System.out.println(list.get(3));
	}

}
