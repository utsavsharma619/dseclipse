package dsDIVIDEANDCONQUER;

public class HouseThief {
	public static void main(String[] args) {
		int[] house = {6,7,1,30,8,2,4};
		System.out.println(check(house,0));;
	}
	public static int check(int[] house,int current)
	{
		if(current>=house.length)
		{
			return 0;
		}
		int m = house[current]+check(house,current+2);
		int n = check(house,current+1);
		return Math.max(m, n);
	}
}