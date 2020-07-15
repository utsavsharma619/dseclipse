package dsDIVIDEANDCONQUER;

public class NumberOfPaths {

	public static void main(String[] args) {
		int[][] a = {{4,7,1,6},{5,7,3,9},{3,2,1,2},{7,1,6,3}};
		System.out.println(check(a,0,0,0));
	}
	public static int check(int[][] a,int row,int col,int total)
	{
		if(row>=a.length || col>=a.length)
		{
			return 0;
		}
		if((row==a.length-1 && col==a.length-1) && total==25)
		{
			return a[row][col];
		}
		int r = check(a,row,col+1,total+a[row][col]);
		int d = check(a,row+1,col,total+a[row][col]);
		return r+d;
	}

}
