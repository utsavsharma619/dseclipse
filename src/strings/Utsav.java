package strings;

import java.util.ArrayList;
import java.util.List;

public class Utsav {

	public static void main(String[] args){
		String[] words = {"leetcode","et","code"};
		List<String> ll = new ArrayList<>();
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=0;j<words.length-1;j++)
			{
				if(i==j)
				{
					continue;
				}
				if(words[i].contains(words[j]))
				{
					ll.add(words[j]);
				}
			}
		}
		System.out.println(ll);
	}
}