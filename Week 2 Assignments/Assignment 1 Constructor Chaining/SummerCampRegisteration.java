package constructors;

public class SummerCampRegisteration {
	String participantName;
	int age;
	String nationality;
	String parentGuardianName;
	int parentGuardianNumber;
	boolean attendedBefore;
	String summerCampName;
	int year;
	static int totalRegisterationCount;
	
	
	public SummerCampRegisteration(){
		totalRegisterationCount++;
	}
public SummerCampRegisteration(String participantName,int age, String nationality, String parentGuardianName) {
	this();
	this.participantName=participantName;
	this.age=age;
	this.nationality=nationality;
	this.parentGuardianName=parentGuardianName;
	
	
}
public SummerCampRegisteration (String participantName,int age, String nationality, String parentGuardianName, int parentGuardianNumber, boolean attendedBefore, String summerCampName, int year) {
	this();
	this.parentGuardianNumber=parentGuardianNumber;
	this.attendedBefore=attendedBefore;
	this.summerCampName=summerCampName;
	this.year=year;
}
public static void main(String[] args) {
	SummerCampRegisteration ahmed = new SummerCampRegisteration("ahmed",21,"egyptian","Hesham",01112261051,true, "Alex",2018);
	System.out.println(ahmed);
}
}
