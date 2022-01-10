package seleniumassignment.dragaanddrop;

import org.openqa.selenium.WebDriver;

public class Runner {
	public static void main(String[] args) {
		WebDriver driver = Browser.launch("http://demo.automationtesting.in/Static.html");
		HomePage page = new HomePage(driver);
		page.moveLogoImage();
		page.moveOriginalImage();
		page.moveSeleniumImage();

	}
}
