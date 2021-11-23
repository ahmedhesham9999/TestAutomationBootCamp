package constructors;

public class Vehicle {
	public String brandName;
	public String numberOfDoors;
	public String fuelType;
	
	public Vehicle(String brandName, String numberOfDoors, String fuelType) {
		this.brandName = brandName;
		this.numberOfDoors=numberOfDoors;
        this.fuelType = fuelType;
       
        this.details();
	}
	public void details() {
		System.out.println("BrandName" +brandName);
		System.out.println("Number of doors" +numberOfDoors);
		System.out.println("Fuel Type" +fuelType);
		
	}

}
