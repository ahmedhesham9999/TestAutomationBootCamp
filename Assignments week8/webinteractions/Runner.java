package seleniumassignment.webinteractions;

import org.openqa.selenium.WebDriver;

import seleniumassignment.Browser;

public class Runner {
	public static void main(String[] args) {
		Runner r = new Runner();
		TicketBO ticketData = r.getTicketData();

		WebDriver driver = Browser.launch("https://www.skyscanner.co.in/");

		BookTicket ticket = new BookTicket(ticketData, driver);
		ticket.checkOneWay();
		ticket.fillFromLocation();
		ticket.fillToDestination();
		ticket.selectDeparture();
		ticket.selectCabinClass();
		ticket.increaseAdults();
		ticket.increaseChildren();
		ticket.clickDone();
		ticket.checkDirectFlight();
		ticket.searchFlight();

	}

	private TicketBO getTicketData() {
		TicketBO ticket = new TicketBO();
		ticket.setFlightType("OneWay");
		ticket.setFromLocation("Dubai");
		ticket.setToDestination("Singapore");
		ticket.setTicketType("One way");
		ticket.setDepartureDate("24");
		ticket.setAdults("3");
		ticket.setChildren("2");
		ticket.setCabinClassType("Business");

		System.out.println("Ticket Data" + ticket);
		return ticket;
	}
}
