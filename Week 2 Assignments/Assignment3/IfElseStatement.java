package operators;

public class IfElseStatement {
	int mark;
	
	public  IfElseStatement(int mark) {
		this.mark=mark;
		getGrade();
	}
	public void getGrade() {
		if(mark<=35 && mark<50) {
			System.out.println("Grade is C");
			
		}
		else if(mark<=50 && mark<60) {
			System.out.println("Grade is B");
			
		}
		else if(mark<=60 && mark<75) {
			System.out.println("Grade is A");
			
		}
		else {
			System.out.println("Grade is Distinction");
		}
	}
	public static void main(String[] args) {
		IfElseStatement ahmed = new IfElseStatement(35);
		IfElseStatement mohamed = new IfElseStatement(60);
		IfElseStatement yasser = new IfElseStatement(50);
		IfElseStatement hesham = new IfElseStatement(80);
	}

}
