package backtracking;

public class ShortestPath {

	public static void main(String[] args) {
		int[][] a = {{1,1,1,1,1,0,0,1,1,1},{0,1,1,1,1,1,0,1,0,1},{0,0,1,0,1,1,1,0,0,1},{1,0,1,1,1,0,1,1,0,1},{0,0,0,1,0,0,0,1,0,1},{1,0,1,1,1,0,0,1,1,0},{0,0,0,0,1,0,0,1,0,1},{0,1,1,1,1,1,1,1,0,0},{1,1,1,1,1,0,0,1,1,1},	{0,0,1,0,0,1,1,0,0,1}};
		int r = a.length;
		int c = a[0].length;
		boolean[][] vis = new boolean[r][c];
		System.out.println(shortestpath(a,0,0,8,0,vis));;
	}
	public static int shortestpath(int[][] a,int i,int j,int x,int y,boolean[][] vis)
	{
		if(!isValid(a, i, j, vis))
		{
			return 9999999;
		}
		if(i==x && j==y)
		{
			return 0;
		}
		vis[i][j]=true;
		int left = 1+shortestpath(a, i, j-1, x, y, vis);
		int bottom = 1+shortestpath(a, i+1, j, x, y, vis);
		int right = 1+shortestpath(a, i, j+1, x, y, vis);
		int top = 1+shortestpath(a, i-1, j, x, y, vis);
		vis[i][j]=false; //		BACKTRACKING ONE LINE
		return Math.min(Math.min(left, right), Math.min(top, bottom));
	}
	public static boolean isValid(int[][] a,int i,int j,boolean[][] vis)
	{
		int r = a.length;
		int c = a[0].length;
		return i>=0 && j>=0 && i<r && j<c && a[i][j]==1 && !vis[i][j];
	}
}