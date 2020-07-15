package recursion;

public class Replacepi {
	public static void main(String[] args) {
		String snew = "";
		String str = "2 * pi + 3 * pi = 5 * pi";
		System.out.println(check(str,snew,0));;
	}
	public static String check(String str,String snew,int start)
	{
		if(start<str.length())
		{
			if(str.charAt(start)=='p' && str.charAt(start+1)=='i')
			{
				return "3.14"+check(str,snew,start+2);
			}
			else
			{
				return str.charAt(start)+check(str,snew,start+1);
			}
		}
		else
		{
			return snew;
		}
	}
}
