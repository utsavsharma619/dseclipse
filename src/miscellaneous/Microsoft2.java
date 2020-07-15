package miscellaneous;

public class Microsoft2 {

	public static void main(String[] args) {
		int i,j;
		char[] n1 = {'a','b','c'};
		char[] n2 = {'d','e','f'};
		System.out.println("enter a number");
		int no = 12;
		for(i=0;i<n1.length;i++)
		{
			for(j=0;j<n2.length;j++)
			{
				System.out.println(""+n1[i]+n2[j]);
			}
		}
	}

}
