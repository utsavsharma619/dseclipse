package miscellaneous;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reversee(1534236469));;
	}
	 public static int reversee(int x) {
		 long val=0;
		 long k = x;
		 long len=0;
		 while(k!=0)
		 {
			 k=k/10;
			 len++;
		 }
		 long mul = (int)Math.pow(10,len-1);
		 while(x!=0)
	        {
	            val = val + x%10 * mul;
	            mul=mul/10;
	            x=x/10;
	        }
		 int sign=1;
		 sign=sign*val'
	        return sign;
		 }
	}
