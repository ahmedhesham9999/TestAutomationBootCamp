package collectionlist.sportmanagement;

public class PlayerBo {
	private String number;
	private String name;
	private int age;
	private String country;
	private String sport;

	public PlayerBo() {
		number = "p" + Math.random();
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return "PlayerBo [number=" + number + ", name=" + name + ",age=" + age + ",country=" + country + "]";

	}
}
