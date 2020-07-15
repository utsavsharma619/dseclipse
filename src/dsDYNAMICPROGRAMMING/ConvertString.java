package dsDYNAMICPROGRAMMING;

public class ConvertString {

	public static void main(String[] args) {
		String s1 = "thhhable";
		String s2 = "tgggable";
		System.out.println(check(s1,s2,0,0));
	}
	public static int check(String s1,String s2,int i1,int i2)
	{
		if(i1>=s1.length() || i2>=s2.length())
		{
			return 0;
		}
		if(s1.charAt(i1)==s2.charAt(i2))
		{
			return check(s1,s2,i1+1,i2+1);
		}
		int del = 1 + check(s1,s2,i1,i2+1);
		int add = 1 + check(s1,s2,i1+1,i2);
		int rep = 1 + check(s1,s2,i1+1,i2+1);
		return Math.min(Math.min(del,add),Math.min(add,rep));
	}
}
