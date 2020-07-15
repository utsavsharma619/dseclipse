package miscellaneous;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "axc", t = "ahbgdc";
		System.out.println(isSubsequence(s,t));
	}
		public static boolean isSubsequence(String s, String t) {
	        int k = check(s,t,0,0);
	        if(k>10)
	        {
	            return false;
	        }
	        else
	        {
	            return true;
	        }
	    }
	    public static int check(String s, String t,int si,int ti)
	    {
	        if(si>=s.length())
	        {
	            return 0;
	        }
	        if(ti>=t.length())
	        {
	            return Integer.MAX_VALUE-10;
	        }
	        if(s.charAt(si)==t.charAt(ti))
	        {
	            return 1 + check(s,t,si+1,ti+1);
	        }
	        return check(s,t,si,ti+1);
	    }
	}