package pattern;

public class PrintPattern {
	public void Print(int n) {
      int line=1;
      int star=0;
      for(line=0; line <= n;) {
	if (star < line) {
		System.out.print("*");
		star++;
		continue;
		
	}
	if(star==line) {
		System.out.println(" ");
		line++;
		star=0;
	}
}
}
	public static void main(String[] args) {
		PrintPattern p1 =new PrintPattern();
		p1.Print(7);
	}
}