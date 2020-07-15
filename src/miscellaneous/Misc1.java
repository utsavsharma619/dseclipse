package miscellaneous;


public class Misc1 {
	public static void main(String[] args) {
        int[] A = {4,0,5};
        int K = 5;
		System.out.println(check(A,K,0,0));;
    }
    public static int check(int[] A, int K,int sum,int i)
    {
        if(i==A.length)
        {
            return 0;
        }
        if((sum+A[i])%K==0)
        {
            return 1 + check(A,K,sum+A[i],i+1);
        }
        return check(A,K,sum+A[i],i+1) + check(A,K,sum,i+1);
    }
}