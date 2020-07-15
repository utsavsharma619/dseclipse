package recursion;

public class GameTheory {

	public static void main(String[] args) {
		int[] a = {1,5,7,3,2,4};
		System.out.println(max(a,0,a.length-1));;
	}
	public static int max(int[] a , int l,int r)
	{
		if(l+1==r)
		{
			return Math.max(a[l], a[r]);
		}
		return Math.max(a[l]+Math.min(max(a,l+2,r), max(a,l+1,r-1)),a[r]+
			   Math.min(max(a,l+1,r-1), max(a,l,r-2)));
	}
}