package seleniumassignment.windowhandling;

import org.openqa.selenium.By;

public interface IHome {
	By CLICK_BUTTON = By.className("btn btn-info");
	By NEWWINDOW_LINKTEXT = By.linkText("CVE-2021-45105");
	By WEBTABLE_BUTTON = By.xpath("//a[contains(text(),'WebTable')]");

	void getWindowHandle();

	void getWindowHandles();

	void validateNewWindow();

	void closeNewWindow();

	void backtoParentWindow();

	void validateParentWindow();
}
