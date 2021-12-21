package oops.condosystem;

public abstract class Facility {
	int openTime;
	int closeTime;
	int maxPeople;

	public Facility(int openTime, int closeTime, int maxPeople) {
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.maxPeople = maxPeople;

	}

	public abstract void print();

}
