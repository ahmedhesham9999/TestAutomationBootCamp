package oops.condosystem;

public class BarbequeArea extends Facility {
	public BarbequeArea(int openTime, int closeTime, int maxPeople) {
		super(openTime, closeTime, maxPeople);
		System.out.println("BarbequeArea Constructor");
	}

	@Override
	public void print() {
		System.out.println("Opening Time : " + openTime);
		System.out.println("Closing Time : " + closeTime);
		System.out.println("Maximum People allowed to attend" + maxPeople);
	}

}
