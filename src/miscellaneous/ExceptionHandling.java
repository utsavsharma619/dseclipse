package miscellaneous;

public class ExceptionHandling {

	public static void main(String[] args) {
		int l=8,j=0;
		int[] arr = new int[4];
		try {
			int k = l/j;
			System.out.println(k);
			for(int i=0;i<=4;i++)
			{
				arr[i] = i;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by 0 " + e);
		}
		catch(Exception e)
		{
			System.out.println("Array is out of Index..must be 4 items");
		}
		finally 
		{
			System.out.println("finally...ok byee");
		}
	}
}
