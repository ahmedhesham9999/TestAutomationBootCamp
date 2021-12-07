package strings;

public class Substring {
	public void substringExample(String a) {
		System.out.println(a.substring(2));
	}
public static void main(String[] args) {
	Substring s1 = new Substring();
	s1.substringExample("HelloHe");
	s1.substringExample("HelloHi");
	s1.substringExample("Hi");
}
}
