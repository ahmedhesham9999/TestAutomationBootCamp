package seleniumassignment.dragaanddrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage implements IHome {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void moveLogoImage() {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(LOGO_IMAGE);
		WebElement drop = driver.findElement(DROP_AREA);
		action.dragAndDrop(drag, drop).perform();
	}

	@Override
	public void moveOriginalImage() {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(ORIGINAL_IMAGE);
		WebElement drop = driver.findElement(DROP_AREA);
		action.dragAndDrop(drag, drop).perform();

	}

	@Override
	public void moveSeleniumImage() {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(SELENIUM_IMAGE);
		WebElement drop = driver.findElement(DROP_AREA);
		action.dragAndDrop(drag, drop).perform();

	}

}
