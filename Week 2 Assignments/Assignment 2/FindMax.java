package operators;

public class FindMax {
	int a;
	int b;
	int c;
	int max;

public FindMax(int a, int b, int c) {
	this.a=a;
	this.b=b;
	this.c=c;
	
	returnMax();
	
}
public void returnMax() {
	  max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
	  System.out.println("Maximum number among " + a
              + ", " + b + " and " + c + " is "
              + max);
}
public static void main(String[] args) {
	FindMax user = new FindMax(5,10,50);
}
}
