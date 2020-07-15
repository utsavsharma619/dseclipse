package dsDIVIDEANDCONQUER;

public class MinCost {

	public static void main(String[] args) {
		int[][] a = {{4,7,8,6,4},{6,7,3,9,2},{3,8,1,2,4},{7,1,7,3,7},{2,9,8,9,3}};
		System.out.println(check(a,0,0));
	}
	public static int check(int[][] a, int curr1 , int curr2)
	{
		if(curr1==5 || curr2==5)
		{
			return Integer.MAX_VALUE;
		}
		if(curr1==4 && curr2==4)
		{
			return a[curr1][curr2];
		}
		int k = check(a,curr1,curr2+1);
		int l = check(a,curr1+1,curr2);
		int min = Integer.min(k, l);
		int current = a[curr1][curr2];
		return min+current;
	}
}