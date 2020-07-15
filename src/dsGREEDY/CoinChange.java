package dsGREEDY;

public class CoinChange {

	static int no=0,x=121;
	public static void main(String[] args) {
		int[] a = {1,2,5,10,20,50,100,500,1000,2050};
		while(x!=0)
		{
			change(a,x);
		}
		System.out.println("ANSWER : " + no);
	}
	public static void change(int[] a,int x)
	{
		for(int i=0;i<9;i++)
		{
			if(x>=a[i] && x<a[i+1])
			{
				x = x - a[i];
				no++;
				CoinChange.x = x;
				break;
			}
		}
	}
}