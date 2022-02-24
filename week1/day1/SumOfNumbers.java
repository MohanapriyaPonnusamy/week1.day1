package week1.day1;

public class SumOfNumbers {

	public static void main(String[] args) {
		int input = 123;
		int sum  = 0, quetiont = 1 , remainder = 0;
		
		
		while (quetiont != 0) {
			
			remainder =  input % 10;
			quetiont = input / 10;
			input = quetiont;
			sum = sum + remainder;
			}
		System.out.println(sum);

	}

}
