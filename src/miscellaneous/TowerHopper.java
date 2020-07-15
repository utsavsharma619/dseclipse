package miscellaneous;

public class TowerHopper {

	public static void main(String[] args) {
		int[] tower = {4,2,0,0,2,0};
		System.out.println(isHoppable(tower,0,tower[0]));;
	}
	public static int isHoppable(int[] tower,int i,int end)
	{
		if(i>=end)
		{
			return 1;
		}
		if(tower[i]+i==end && i<=end)
		{
			return isHoppable(tower, tower[i]+i, tower[i]+i+tower[end]);
		}
		return isHoppable(tower,i+1,end);
	}
}