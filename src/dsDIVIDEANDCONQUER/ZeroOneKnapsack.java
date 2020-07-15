package dsDIVIDEANDCONQUER;

public class ZeroOneKnapsack {
	public static void main(String[] args) {
		int[] val = {31,26,72,17};
		int[] wt = {3,1,5,2};
		System.out.println(check(val,0,wt,7));
	}
	public static int check(int[] val,int curr,int[] wt,int cap)
	{
		if(cap<=0 || curr>=4 || curr<0)
		{
			return 0;
		}
		int sel=0;
		if(wt[curr]<=cap)
		{
			sel = val[curr] + check(val,curr+1,wt,cap-wt[curr]);
		}
		int non = check(val,curr+1,wt,cap);
		return Math.max(sel, non);
	}
}
