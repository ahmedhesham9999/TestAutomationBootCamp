package seleniumassignment.dragaanddrop;

import org.openqa.selenium.By;

public interface IHome {
	By LOGO_IMAGE = By.id("angular");
	By ORIGINAL_IMAGE = By.id("mongo");
	By SELENIUM_IMAGE = By.id("node");
	By DROP_AREA = By.id("droparea");

	void moveLogoImage();

	void moveOriginalImage();

	void moveSeleniumImage();

}
