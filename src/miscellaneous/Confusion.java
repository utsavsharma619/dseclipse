package miscellaneous;

public class Confusion {

	public static void main(String[] args) {
		int i=5;
		int a,b;
		a=++i; // a=6,i=5
		System.out.println(a);
		b=i++; // a=7,i=6
		System.out.println(b);
	}
}
