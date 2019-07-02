package leetcode;
class Shortpath {
	public static void main(String args[])
	{
		int m=3;
		int n=7;
		int xx=Shortpath.uniquePaths(m, n);
		System.out.println(xx);
	}
    static int uniquePaths(int m, int n) {
        int mm[][]=new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(j==0||i==0)
			{
				mm[i][j]=1;
			}
			else
			{
				mm[i][j]=mm[i-1][j]+mm[i][j-1];
			}
		}
	}
	return mm[m-1][n-1];
    }
}