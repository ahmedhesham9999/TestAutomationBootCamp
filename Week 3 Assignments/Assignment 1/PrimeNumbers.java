package loop;

public class PrimeNumbers {
static boolean checkPrime(int checkNumber) {
	if(checkNumber== 1) {
		return false;
		
	}
	for(int i =2; i*i<= checkNumber; i++) {
	if(checkNumber %i==0) {
		return false;
	}	
	}
	return true;
}
public static int primeSum(int l, int r) {
	int sum =0;
	for(int i = r; i>=l; i--) {
		boolean isPrime = checkPrime(i);
		if(isPrime) {
			sum=sum+i;
		}
	}
	return sum;
	
}
public static void main(String[] args) {
	int l=1;
	int r=20;
	System.out.println(primeSum(l,r));
}
}
