package mayleetcode;

import java.util.ArrayList;
import java.util.List;


public class RansomNote {

	public static void main(String[] args) {
		String r = "aa";
		String m = "baab";
		char[] ar = r.toCharArray();
		char[] mr = m.toCharArray();
		check(ar,mr,0,0);
	}
	public static boolean check(char[] ar,char[] mr,int i,int j)
	{
		boolean ans = false;
		while(i<ar.length && j<mr.length)
		{
			if(i==mr.length)
			{
				ans = true;
				break;
			}
			else if(mr[i]==ar[j])
			{
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		return ans;
	}
}
