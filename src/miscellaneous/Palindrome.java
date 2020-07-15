package miscellaneous;

public class Palindrome {

	public static void main(String[] args) {
		int x = 12221;
		String s="";
		String str = s.valueOf(x);
		System.out.println(palin(str,0,str.length()-1));
	}
	public static boolean palin(String str,int l,int r)
	{
		if(l==r || l>r)
		{
			return true;
		}
		if(str.charAt(l)==str.charAt(r))
		{
			return palin(str, l+1, r-1);
		}
		else
		{
			return false;
		}
	}
}
