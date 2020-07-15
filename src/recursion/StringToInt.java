package recursion;

public class StringToInt {

	public static void main(String[] args) {
		String s = "12";
		int n=s.length()-1;
		System.out.println(check(s,0,n));;
	}n
	public static int check(String s,int i,int n)
	{
		if(s.length()==1)
		{
			return s.charAt(0);
		}
		else
		{
			return (int)s.charAt(i)*(int)Math.pow(10,n) + check(s,i+1,n-1) ;
		}
	}
}
