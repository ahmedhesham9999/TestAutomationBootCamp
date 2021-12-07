package arrays;

public class Array1 {
	public static void main(String[] args) {
		Array1 a =new Array1();
		 int [] arr =  {1, 8, 3,};  
		 int[]arr1 = {5,-5,2};
		 int[]arr2= {7,0,-10};
		 a.Sum(arr);
	    a.Sum(arr1);
		a.Sum(arr2);
		
	}
public void Sum(int[]arr) {
	int sum =0;
	for(int i =0;i<arr.length;i++) {
		sum= sum+arr[i];
	}
	System.out.println("sum of array is" +sum);
}

}
