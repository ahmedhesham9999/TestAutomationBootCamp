package seleniumassignment;

public interface IRegisteration {

	public void launchDriver();

	public void openUrl(String url);

	public void getFname(String fname);

	public void getLname(String lname);

	public void checkGender();

	public void getAddress(String add);

	public void getEmail(String email);

	public void getPhone(String phone1);

	public void getHobbies();

	public void getPassword(String pass);

	public void checkPassword(String cpass);

	public void clickSubmit();

	public void clickRefresh();

}
