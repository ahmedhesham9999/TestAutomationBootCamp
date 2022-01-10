package seleniumassignment.windowhandling;

import org.openqa.selenium.WebDriver;

import seleniumassignment.Browser;

public class Runner {
	public static void main(String[] args) {
		WebDriver driver = Browser.launch("http://demo.automationtesting.in/Windows.html");
		HomePage home = new HomePage(driver);
		home.getWindowHandle();
		home.getWindowHandles();
		home.validateNewWindow();
		home.closeNewWindow();
		home.backtoParentWindow();
		home.validateParentWindow();

	}
}
