package miscellaneous;

import java.util.Stack;

public class Stak {

	public static void main(String[] args) {
		String S = "()))((";
		Stack<Character> st = new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==')' && st.size()==0)
            {
                st.push(S.charAt(i));
            }
            else if(S.charAt(i)==')' && st.peek()==')')
            {
                st.push(S.charAt(i));
            }
            else if(S.charAt(i)=='(')
            {
                st.push(S.charAt(i));    
            }
            else if(S.charAt(i)==')')
            {
                st.pop();
            }            
        }
        System.out.println(st.size());
	}

}
