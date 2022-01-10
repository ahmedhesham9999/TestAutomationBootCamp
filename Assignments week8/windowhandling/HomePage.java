package seleniumassignment.windowhandling;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage implements IHome {
	private WebDriver driver;
	String parentWindow = driver.getWindowHandle();
	Set<String> allWindows = driver.getWindowHandles();

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void getWindowHandle() {
		// TODO Auto-generated method stub
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement e = driver.findElement(CLICK_BUTTON);
		e.click();

	}

	@Override
	public void getWindowHandles() {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

	}

	@Override
	public void validateNewWindow() {
		// TODO Auto-generated method stub
		WebElement text = driver.findElement(NEWWINDOW_LINKTEXT);
		text.click();

	}

	@Override
	public void closeNewWindow() {
		// TODO Auto-generated method stub
		for (String w : allWindows) {
			if (w != parentWindow) {
				driver.switchTo().window(w);

			}
		}
	}

	@Override
	public void backtoParentWindow() {
		// TODO Auto-generated method stub

		driver.close(); // close current tab on which driver is focusing
		driver.switchTo().window(parentWindow);
	}

	@Override
	public void validateParentWindow() {
		// TODO Auto-generated method stub
		String text = driver.findElement(WEBTABLE_BUTTON).getText();
		System.out.println(text);
	}

}
