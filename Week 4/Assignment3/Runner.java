package oops.encapsulation;

public class Runner {
	public static void main(String[] args) {
		Browser chrome = new Browser("Chrome", 7, "windows", true);
		System.out.println(chrome);
		System.out.println("---------------------------------------------");

		Browser firefox = new Browser("Firefox", 8, "MacOS", true);
		System.out.println(firefox);
		System.out.println("---------------------------------------------");

		Browser safari = new Browser("Safari", 6, "MacOS", true);
		System.out.println(safari);
	}
}
