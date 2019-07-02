package leetcode;

import javax.swing.border.MatteBorder;

public class MinPathSum {
	 public static int minPathSum(int[][] grid)
	 {
		 int[][] sum=new int[grid[0].length+1][grid.length+1];
		 sum[0][0]=grid[0][0];
		 for(int i=1;i<grid[0].length;i++)
		 {
			 sum[0][i]=sum[0][i-1]+grid[0][i];
		 }
		 for(int j=1;j<grid.length;j++)
		 {
			 sum[j][0]=sum[j-1][0]+grid[j][0];
		 }
		 
		 for(int i=1;i<grid.length;i++)
		 {
			 for(int j=1;j<grid[0].length;j++)
			 {
				 sum[i][j]=Math.min(sum[i-1][j],sum[i][j-1])+grid[i][j];
				 System.out.println(sum[i][j]);
			 }
		 }
		 return sum[grid[0].length-1][grid.length];
	 }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] m= {{1,3,1,4},{1,5,1,1},{4,2,1,4}};
		int k=minPathSum(m);
		System.out.println(m[0].length);
	}

}
