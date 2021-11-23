package constructors;

public class SearchHotel {
	public String hotelName;
	public String startDate;
	public int numberOfNights;
	public int totalAdult;
	public int totalChildren;
	public String roomType;
	public String withBreakfast;
	
	public SearchHotel(String hotelName,String startDate, int numberOfNights, int totalAdult,int totalChildren, String roomType, String withBreakfast) {
		this.hotelName=hotelName;
		this.startDate=startDate;
		this.numberOfNights=numberOfNights;
		this.totalAdult=totalAdult;
		this.totalChildren=totalChildren;
		this.roomType=roomType;
		this.withBreakfast=withBreakfast;
		
		this.details();	
	}
	 public void details() {
		 System.out.println("Hotel Name is " +hotelName);
		 System.out.println("Start Date is " +startDate);
		 System.out.println("Number of nights " +numberOfNights );
		 System.out.println("total adult " +totalAdult);
		 System.out.println("total Children" +totalChildren);
		 System.out.println("Room Type" +roomType);
		 System.out.println("Breakfast" +withBreakfast);
	 }

}
