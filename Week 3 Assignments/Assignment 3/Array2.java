package arrays;

public class Array2 {
	public void getLength(int[]arr) {
		int len = arr.length;
		int newArr[]= new int[len*2];
		 
		
		
		
		for(int i =0;i<newArr.length-1;i++) {
			
			System.out.println(newArr[i]);
			
		}
		int lastNum = arr[arr.length-1];
		System.out.println(lastNum);
	}
	public static void main(String[] args) {
		Array2 a2 = new Array2();
		int[]arr= {0,3,5};
		a2.getLength(arr);
		System.out.println("--------------------------");
		int[]arr2= {-1,0};
		a2.getLength(arr2);
		System.out.println("--------------------------");
		int[]arr3= {9};
		a2.getLength(arr3);
		
	
	}

}
