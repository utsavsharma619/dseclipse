package mayleetcode;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String s = "loveleetcode";
		char[] arr = s.toCharArray();
		int z=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=arr[j])
				{
					z++;
				}
				else if(arr[i]==arr[j])
				{
					z=0;
					break;
				}
			}
			if(z!=0)
			{
				System.out.println(i + " is the answer");
				break;
			}
			else if(z==0)
			{
				System.out.println("-1");
				break;
			}
		}
	}
}
