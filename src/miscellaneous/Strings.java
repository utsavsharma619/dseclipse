package miscellaneous;

public class Strings {

	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		System.out.println(a.length() +"   "+ b.length());
		System.out.println(a.concat(b));
		System.out.println(a.toUpperCase());;
		
		String s1 = "ut,sav,shar,ma";
		String[] names = s1.split(",");
		System.out.println(names[0]);
//		String str = "192.168.43.1";
//		String k = str.replace(".","[.]");
//		System.out.println(k);
	}
}

//class Student{
//	int age;
//	String name;
//	Student(int age,String name)
//	{
//		this.age=age;
//		this.name=name;
//	}
//}
