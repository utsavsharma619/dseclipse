package miscellaneous;

public class NumberPalindrome {

	public static void main(String[] args) {
		int x = 391193;
		int length=0;
        int xn = x;
        int xm = x;
        while(xn!=0)
        {
            xn=xn/10;
            length++;
        }
        int half = length/2;
        int count=0;
        while(count<=half)
        {
            count++;
            xm=xm/10;   
        }
        int p = 0;
        p = (int)Math.pow(10,half-1);
        int fin=0;
        int counts=0;
        while(counts!=half)
        {
            fin = fin + (x%10)*p;
            x=x/10;
            p=p/10;
            counts++;
        }
        System.out.println("x = " + x);
        System.out.println("half = " + half);
        System.out.println("fin = " + fin);
        System.out.println("xm = " + xm);
        System.out.println("***********************************************");
        if(fin==x)
        {
        	System.out.println("PALINROMEEE");
        }
        else
        {
        	System.out.println("NOOOOOO");
        }
	}
}