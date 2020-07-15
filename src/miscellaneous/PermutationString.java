package miscellaneous;

public class PermutationString {

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		generatePerm(str,0,len-1);
	}
	public static void generatePerm(String str,int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			str = swapchar(str,start,i);
			System.out.println(str);
			generatePerm(str, start+1, end);
			str = swapchar(str,start,i);
		}
	}
	public static String swapchar(String str,int i,int j)
	{
		char[] b = str.toCharArray();
		char ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return str.valueOf(b);
	}
}