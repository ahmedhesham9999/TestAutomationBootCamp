package operators;

public class SwitchCase1 {
	String day;
public SwitchCase1(String day) {
	this.day = day;
	getDietPlan();
	
	
}
public void getDietPlan() {
	switch(day) {
		case"Monday":
		case"Wednesday":
			System.out.println("your meal is fish and rice");
			break;
			
		case"Saturday":
		case"Sunday":
			System.out.println("your meal is grilled fish");
			break;
			
		case"Tuesday":
		case"Friday":
			System.out.println("your meal is oat and yoghurt");
			break;
		default:
			System.out.println("Not Found");
			break;
}
}
  public static void main(String[] args) {
	SwitchCase1 monday = new SwitchCase1("Monday");
	SwitchCase1 sunday = new SwitchCase1("Sunday");
	SwitchCase1 friday = new SwitchCase1("Friday");
}
}
