package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterationPage implements IRegisteration {
	WebDriver driver;

	@Override
	public void launchDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Override
	public void openUrl(String url) {

		driver.get(url);
	}

	@Override
	public void getFname(String fname) {
		// TODO Auto-generated method stub
		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder = 'First Name']"));
		firstName.sendKeys(fname);

	}

	@Override
	public void getLname(String lname) {
		// TODO Auto-generated method stub
		WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		lastName.sendKeys(lname);
	}

	public void checkGender() {
		WebElement gender = driver.findElement(By.xpath("//input[@value ='Male']"));
		gender.click();
	}

	@Override
	public void getAddress(String add) {
		// TODO Auto-generated method stub
		WebElement address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		address.sendKeys(add);
	}

	@Override
	public void getEmail(String email) {
		// TODO Auto-generated method stub
		WebElement emailAddress = driver
				.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
		emailAddress.sendKeys(email);

	}

	@Override
	public void getPhone(String phone1) {
		// TODO Auto-generated method stub
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys(phone1);
	}

	@Override
	public void getHobbies() {
		// TODO Auto-generated method stub
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		hobbies.click();

	}

	@Override
	public void clickSubmit() {
		// TODO Auto-generated method stub
		WebElement submit = driver.findElement(By.id("submitbtn"));
		submit.click();
	}

	@Override
	public void clickRefresh() {
		// TODO Auto-generated method stub

		WebElement refresh = driver.findElement(By.xpath("//*[@id=\"Button1\"]"));
		refresh.click();
	}

	@Override
	public void getPassword(String pass) {
		// TODO Auto-generated method stub
		WebElement password = driver.findElement(By.id("firstpassword"));
		password.sendKeys(pass);

	}

	@Override
	public void checkPassword(String cpass) {
		WebElement cpassword = driver.findElement(By.id("secondpassword"));
		cpassword.sendKeys(cpass);

	}

}
