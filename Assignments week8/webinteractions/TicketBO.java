package seleniumassignment.webinteractions;

public class TicketBO {
	private String ticketType;
	private String fromLocation;
	private String toDestination;
	private String departureDate;
	private String cabinClassType;
	private String adults;
	private String children;
	private String flightType;

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToDestination() {
		return toDestination;
	}

	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getCabinClassType() {
		return cabinClassType;
	}

	public void setCabinClassType(String cabinClassType) {
		this.cabinClassType = cabinClassType;
	}

	public String getAdults() {
		return adults;
	}

	public void setAdults(String adults) {
		this.adults = adults;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	@Override
	public String toString() {
		return "TicketBO [Ticket Type " + ticketType + "From " + fromLocation + "To " + toDestination + "Departure "
				+ departureDate + "Cabin Type" + cabinClassType + "Adults " + adults + "Children" + children
				+ " Flight Type" + flightType + "]";
	}
}
