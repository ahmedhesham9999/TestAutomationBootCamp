package classandobjectsintro;

public class Runner {

	public static void main(String[] args) {
		Zoo monkey = new Zoo("Monkey", 20, "zizo", 10, 1000, true, true);
		monkey.print();
		monkey.isAdopted();
		monkey.counter();
		System.out.println("----------------------");

		Zoo dog = new Zoo("Dog", 21, "Milo", 2, 1500, false, true);
		dog.print();
		dog.isAdopted();
		dog.counter();
		System.out.println("----------------------");

		Zoo cat = new Zoo("Cat", 21, "Fibi", 1, 500, true, false);
		cat.print();
		cat.isAdopted();
		cat.counter();
	}

}
