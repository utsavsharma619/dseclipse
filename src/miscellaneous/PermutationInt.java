package miscellaneous;

public class PermutationInt {

	public static void main(String[] args) {
		String str = "abc";
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			for(int j=0;j<str.length();j++)
			{
				if(j!=i)
					System.out.print(str.charAt(j));
				}
			}
		}
	}

}
