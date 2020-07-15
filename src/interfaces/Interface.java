package interfaces;

public class Interface {
	public static void main(String args[]) {
		Phone phone = new OnePlus();
		Phone phone1 = new Iphone();
		System.out.println(phone.processor());
		System.out.println(phone1.processor());
	}
}
