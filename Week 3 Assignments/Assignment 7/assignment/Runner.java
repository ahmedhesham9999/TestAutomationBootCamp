package oops.inheritance.assignment;

public class Runner {
public static void main(String[] args) {
	Student s1 = new Student();
	s1.getName("Ahmed");
	s1.getAge(15);
	s1.geGrade(10);
	s1.geAddress("zamalek");
	s1.getSchool("MLS ");
	
	System.out.println("------------------------------------------------------");
	Employee e1 = new Employee();
	e1.getName("Mahmoud");
	e1.getAge(51);
	e1.geAddress("Giza");
	e1.getCompany("Orascom");
	e1.getSalary(2000);
	e1.getEmployeeType("salesman");
}
  
}
