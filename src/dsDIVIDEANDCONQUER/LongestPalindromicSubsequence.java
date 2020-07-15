package dsDIVIDEANDCONQUER;

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		String s = "ELRMENMET";
		System.out.println(check(s,0,8));
	}
	public static int check(String s,int start,int end)
	{
		if(start==end)
		{
			return 1;
		}
		int c=0;
		if(s.charAt(start)==s.charAt(end))
		{
			c = 2 + check(s,start+1,end-1);
		}
		int a = check(s,start+1,end);
		int b = check(s,start,end-1);
		return Math.max(Math.max(a, b),Math.max(b, c));
	}
}
