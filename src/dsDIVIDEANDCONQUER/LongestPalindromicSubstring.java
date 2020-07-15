package dsDIVIDEANDCONQUER;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String s = "ABCCBUA";
		System.out.println(check(s,0,6));
	}
	public static int check(String s,int start,int end)
	{
		if(start>end)
		{
			return 0;
		}
		if(start==end)
		{
			return 1;
		}
		int c=0;
		if(s.charAt(start)==s.charAt(end))
		{
			c = check(s,start+1,end-1);
		}
		return Math.max(c, d);
	}
}