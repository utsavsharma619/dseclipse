package sorting;

public class SelectionSort {
	static int[] a = {3,17,25,5,2,1};
	public static void main(String[] args) {
		selection();
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void selection()
	{
		int i,j;
		for(j=0;j<5;j++)
		{
			int min=j;
			for(i=j;i<=5;i++)
			{
				if(a[i]<a[min])	
				{
					int temp = a[min];
					a[min] = a[i];
					a[i] = temp;			
				}
			}
		}
	}
}