package classandobjectsintro;

public class Zoo {
	String animalName;
	int animalNumber;
	String petName;
	int age;
	int adoptionPrice;
	boolean adopted;
	boolean isFriendly;

	public Zoo(String animalName, int animalNumber, String petName, int age, int adoptionPrice, boolean adopted,
			boolean isFriendly) {
		this.animalName = animalName;
		this.animalNumber = animalNumber;
		this.petName = petName;
		this.age = age;
		this.adoptionPrice = adoptionPrice;
		this.adopted = adopted;
		this.isFriendly = isFriendly;

	}

	public void print() {
		System.out.println("Animal Name is " + animalName);
		System.out.println("Animal Number :" + animalNumber);
		System.out.println("Pet name :" + petName);
		System.out.println("Pet Age:" + age);
		System.out.println("adoption Price:" + adoptionPrice);
		System.out.println("Is animal adopted ?" + adopted);
		System.out.println("Is the animal friendly?" + isFriendly);

	}

	public void isAdopted() {
		boolean isAdopted;
		int counter = 100;

		if (isAdopted = true) {
			counter = counter - 1;
			System.out.println(counter);

		} else {
			System.out.println(counter);

		}

	}

	public void counter() {
		int counter = 100;
		int animalNumber = 100;
		if (animalNumber >= counter) {
			counter++;

		} else {
			counter--;
		}

	}
}
