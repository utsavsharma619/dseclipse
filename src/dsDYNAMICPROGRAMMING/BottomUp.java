package dsDYNAMICPROGRAMMING;

public class BottomUp {
	static int[] table = new int[16];
	public static void main(String[] args) {
		System.out.println(fib(9));
	}
	public static int fib(int n)
	{
		table[1]=0;
		table[2]=1;
		for(int i=3;i<=n;i++)
		{
			table[i]=table[i-1]+table[i-2];
		}
		return table[n];
	}
}
