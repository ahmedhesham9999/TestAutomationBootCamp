package strings;

public class StringsRelatedMethods {

	
public void stringConcat(String a , String b) {
   String c = a.concat(b);
	System.out.println(" string is" +c);
	
	
}
public static void main(String[] args) {
	StringsRelatedMethods c1 = new StringsRelatedMethods();
	c1.stringConcat("abc", "cat");
	c1.stringConcat("dog", "cat");
	c1.stringConcat("abc", "");
	
	
}
}