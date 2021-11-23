package statickeyword;

public class BookTicket {
	static int ticketsBooked;
	String flyingFrom;
	String flyingTo;
	String flyingDate;
	
	public BookTicket( String flyingFrom, String flyingTo, String flyingDate) {
		this.flyingFrom= flyingFrom;
		this.flyingTo=flyingTo;
		this.flyingDate=flyingDate;
		
		ticketsBooked++;
		
	}

}
