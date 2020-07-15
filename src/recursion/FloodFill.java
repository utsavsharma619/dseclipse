package recursion;

public class FloodFill {

	public static void main(String[] args) {
		int[][] a = {{1,2,2,2,1,1},{1,2,2,2,2,1},{1,1,1,2,1,2}};
		int r=0;
		int c=2;
		flood(a,r,c);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
	}
	public static void flood(int[][] a,int r,int c)
	{
		if(r<0 || c<0 || c>=a[0].length || r>=3)
		{
			return;
		}
		if(a[r][c]!=2)
		{
			return;
		}
		if(a[r][c]==2)
		{
			a[r][c]=1;
		}
		flood(a,r-1,c);
		flood(a,r,c-1);
		flood(a,r+1,c);
		flood(a,r,c+1);
	}
}
