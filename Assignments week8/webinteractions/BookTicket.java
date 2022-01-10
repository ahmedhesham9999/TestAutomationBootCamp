package seleniumassignment.webinteractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BookTicket implements IBooking {
	private TicketBO ticket;
	private WebDriver driver;

	public BookTicket(TicketBO ticket, WebDriver driver) {
		this.ticket = ticket;
		this.driver = driver;

	}

	@Override
	public void checkOneWay() {
		WebElement e = driver.findElement(ONEWAY_RADIOBUTTON);
		e.click();
	}

	@Override
	public void fillFromLocation() {
		WebElement e = driver.findElement(FROM_TEXTBOX);
		e.clear();
		e.sendKeys(ticket.getFromLocation());
	}

	@Override
	public void fillToDestination() {
		WebElement e = driver.findElement(TO_TEXTBOX);
		e.clear();
		e.sendKeys(ticket.getToDestination());
	}

	@Override
	public void selectDeparture() {
		WebElement date = driver.findElement(DEPART_DROPDOWN);
		date.click();
		Select select = new Select(date);
		select.selectByVisibleText("24");

	}

	@Override
	public void selectCabinClass() {
		WebElement e = driver.findElement(CABINCLASSTRAVELLERS_DROPDOWN);
		e.click();
		WebElement business = driver.findElement(CABINCLASS_DROPDOWN);
		business.click();
		Select select = new Select(business);
		select.selectByVisibleText("Business");

	}

	@Override
	public void increaseAdults() {
		// TODO Auto-generated method stub
		Actions actions = new Actions(driver);
		WebElement increaseAdult = driver.findElement(INCREASEADULTS_BUTTON);
		actions.doubleClick(increaseAdult).perform();
	}

	@Override
	public void increaseChildren() {
		// TODO Auto-generated method stub
		WebElement increaseChildren = driver.findElement(INCREASECHILDREN_BUTTON);
		increaseChildren.click();
	}

	@Override
	public void clickDone() {
		// TODO Auto-generated method stub
		WebElement doneButton = driver.findElement(DONE_BUTTON);
		doneButton.click();
	}

	@Override
	public void checkDirectFlight() {
		// TODO Auto-generated method stub
		WebElement check = driver.findElement(DIRECTFLIGHTS_CHECKBOX);
		check.click();
	}

	@Override
	public void searchFlight() {
		// TODO Auto-generated method stub
		WebElement searchButton = driver.findElement(SEARCHFLIGHTS_BUTTON);
		searchButton.click();
	}

}
