package leetcode;

public class MinCostClimbingStairs {
	public static int minCostClimbingStairs(int[] cost) 
	{	int pre1=0,pre2=0;
		
		for(int i = 2;i<= cost.length;i++){
		    int cur = Math.min(pre1 + cost[i - 2] , pre2 + cost[i - 1]);
		    pre1 = pre2;
		    pre2 = cur;
		}
		
		return pre2;
        
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int cost[]={10, 15, 20};
		int p=minCostClimbingStairs(cost);
		System.out.println(p);
		
		
	}

}
