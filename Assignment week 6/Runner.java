package seleniumassignment;

public class Runner {
	public static void main(String[] args) {
		IRegisteration ahmed = new RegisterationPage();
		ahmed.launchDriver();
		ahmed.openUrl("http://demo.automationtesting.in/Register.html");
		ahmed.getFname("Ahmed");
		ahmed.getLname("Hesham");
		ahmed.getAddress("Cairo,Egypt");
		ahmed.getEmail("ahmedheshaam9999@gmail.com");
		ahmed.checkGender();
		ahmed.getHobbies();
		ahmed.getPassword("123@ahmed");
		ahmed.checkPassword("123@ahmed");
		ahmed.clickRefresh();
		ahmed.clickSubmit();

	}
}
