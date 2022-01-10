package seleniumassignment.webinteractions;

import org.openqa.selenium.By;

public interface IBooking {
	By ONEWAY_RADIOBUTTON = By.id("fsc-trip-type-selector-one-way");
	By FROM_TEXTBOX = By.id("fsc-origin-search");
	By TO_TEXTBOX = By.id("fsc-destination-search");
	By DEPART_DROPDOWN = By.className("DateInput_DateInput--text__MzMyY");
	By CABINCLASSTRAVELLERS_DROPDOWN = By.id("CabinClassTravellersSelector_fsc-class-travellers-trigger__OTYyM");
	By CABINCLASS_DROPDOWN = By.id("search-controls-cabin-class-dropdown");
	By INCREASEADULTS_BUTTON = By.className(
			"BpkButtonBase_bpk-button__NTM4Y BpkButtonBase_bpk-button--icon-only__OWE0M BpkButtonSecondary_bpk-button--secondary__MWI2Z BpkNudger_bpk-nudger__button__NGQxN");
	By DECREASEADULTS_BUTTON = By.className(
			"BpkButtonBase_bpk-button__NTM4Y BpkButtonBase_bpk-button--icon-only__OWE0M BpkButtonSecondary_bpk-button--secondary__MWI2Z BpkNudger_bpk-nudger__button__NGQxN");

	By INCREASECHILDREN_BUTTON = By.className(
			"BpkButtonBase_bpk-button__NTM4Y BpkButtonBase_bpk-button--icon-only__OWE0M BpkButtonSecondary_bpk-button--secondary__MWI2Z BpkNudger_bpk-nudger__button__NGQxN");

	By DECREASECHILDREN_BUTTON = By.className(
			"BpkButtonBase_bpk-button__NTM4Y BpkButtonBase_bpk-button--icon-only__OWE0M BpkButtonSecondary_bpk-button--secondary__MWI2Z BpkNudger_bpk-nudger__button__NGQxN");
	By DONE_BUTTON = By.className("BpkLink_bpk-link__MzIwM");
	By DIRECTFLIGHTS_CHECKBOX = By.name("directOnly");
	By SEARCHFLIGHTS_BUTTON = By.xpath("//input[@type='submit']");

	void checkOneWay();

	void fillFromLocation();

	void fillToDestination();

	void selectDeparture();

	void selectCabinClass();

	void increaseAdults();

	void increaseChildren();

	void clickDone();

	void checkDirectFlight();

	void searchFlight();

}
