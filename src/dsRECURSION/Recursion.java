package dsRECURSION;

public class Recursion {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70,80,90,100,110};
		System.out.println(find(a,0));;
	}
	public static int find(int[] a , int i)
	{
		if(a[i]==50)
		{
			return i;
		}
		return find(a,i+1);
	}
}
