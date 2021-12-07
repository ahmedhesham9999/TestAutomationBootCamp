package strings;

public class StringLength {
public void getMiddle(String s) {
	int stringLength = s.length() ;

	int middle = stringLength/2 ;

	char c = s.charAt(middle-1);
	char x = s.charAt(middle);
	
	
	String z= "" + c + x; //concat two chars together
	System.out.println(z);
}
public static void main(String[] args) {
	StringLength sl = new StringLength();
	sl.getMiddle("string");
	
	StringLength s2 = new StringLength();
	s2.getMiddle("code");
	
	
	StringLength s3 = new StringLength();
	s3.getMiddle("Practice");
	
	
}
}
