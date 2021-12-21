package exceptionhandling;

public class PassengerTicketDetails {
	int age;
	String name;
	String gender;

	public PassengerTicketDetails(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public void printPassengerDetails() {
		System.out.println("Passenger Name" + name);
		System.out.println("Passenger Age" + age);
		System.out.println("Gender" + gender);

	}

	public void allocateBerth(int age) {

		if (age >= 65 && age <= 5) {
			System.out.println("Lower Berth");

			throw new ArithmeticException("Too Young Exception ");

		} else if (age > 5 && age < 65) {
			System.out.println("Upper Berth");
			throw new ArithmeticException("Too Old Exception");
		}

	}

	public static void main(String[] args) {
		PassengerTicketDetails ahmed = new PassengerTicketDetails(0, "ahmed", "Male");
		ahmed.allocateBerth(70);
	}

}
