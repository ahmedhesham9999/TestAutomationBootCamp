package statickeyword;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BookTicket.ticketsBooked);
		
		BookTicket Dallas = new BookTicket("Dallas", "Michigan", "22/12/2021");
		
		System.out.println(BookTicket.ticketsBooked);
		
		BookTicket Egypt = new BookTicket("Egypt", "India", "2/10/2021");
		
		System.out.println(BookTicket.ticketsBooked);
		
	}

}
