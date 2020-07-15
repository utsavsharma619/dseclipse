package miscellaneous;

import java.util.Stack;

public class Parentheses {

	public static void main(String[] args) {
		String p = "(()))(";
		String ans = "BALANCED";
		Stack<Character> s = new Stack<>();
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)=='(')
			{
				s.push(p.charAt(i));
			}
			if(p.charAt(i)==')')
			{
				if(!s.empty())
				{
					s.pop();
				}
				else
				{
					ans="NOT BALANCED";
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
