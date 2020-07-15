package miscellaneous;

public class ReturnToOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String moves = "UD";
		System.out.println(judgeCircle(moves));;
	}
	public static boolean judgeCircle(String moves) {
        return check(moves,0,0,0);
    }
    public static boolean check(String moves,int n,int i,int j)
    {
        if(n>=moves.length() && i==0 && j==0)
        {
            return true;
        }
        else if(n>=moves.length() && (i!=0 || j!=0))
        {
            return false;
        }
        else if(moves.charAt(n)=='U')
        {
            return check(moves,n+1,i,j+1);
        }
        else if(moves.charAt(n)=='D')
        {
            return check(moves,n+1,i,j-1);
        }
        else if(moves.charAt(n)=='L')
        {
            return check(moves,n+1,i-1,j);
        }
        else
        {
            return check(moves,n+1,i+1,j);
        }
    }
}