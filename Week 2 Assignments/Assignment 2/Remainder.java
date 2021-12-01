package operators;

public class Remainder {
	int number1;
	int number2;
	int result;
	
	
public Remainder(int number1,int number2 ) {
	this.number1=number1;
	this.number2=number2;
	
	getRemainder();
	
}
public void getRemainder() {
	result = number1% number2;
	result= result+2;
	
	System.out.println(result);
}
public static void main(String[] args) {
	Remainder ahmed = new Remainder(100,9); 
}

}
