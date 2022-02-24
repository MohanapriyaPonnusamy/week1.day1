package week1.day2;


public class FibonacciSeries {

	public static void main(String[] args) {
	 int firstNumber = 0 , secondNumber = 1;
	 int sum;
	 
	 System.out.println(firstNumber);
	 
	 for (int i = 0; i < 7; i++) {
		 sum = firstNumber + secondNumber;
		 
		 firstNumber = secondNumber;
		 secondNumber = sum;
		 System.out.println(sum);
	
		
	} 
		
	}
	 

	}


