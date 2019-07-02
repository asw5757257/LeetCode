package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class combinationSum {
	public static void c(int[] ch,int target,ArrayList<Integer> result,ArrayList<ArrayList<Integer>> results,int index)
	{
		if(target<ch[0])
		{
			return;
		}
		if(target==0)
		{
			results.add(new ArrayList<Integer>(result));
			System.out.println(result);
			return;
		}
		for(int i=index;i<ch.length&&ch[i]<=target;i++)
		{
			ArrayList<Integer> list1=new ArrayList<Integer>(result);
			list1.add(ch[i]);
			
			c(ch, target-ch[i],list1,results,i);
		}
		
		
	}
	public static ArrayList<ArrayList<Integer>> combination(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> results=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        //排序
        Arrays.sort(candidates);
        c(candidates, target, result, results,0);
        return results;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] ch= {2,3,6,7};
		int target=7;
		ArrayList<ArrayList<Integer>> list=combination(ch, target);
		System.out.println(list);
		
		
	}

}
