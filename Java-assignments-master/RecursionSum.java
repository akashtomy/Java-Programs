import java.util.Scanner;

public class RecursionSum {

	public static int sum_of_digit(int n) {
		int temp= n%10;
		if (temp==0) {
			return 0;
		}
		else {
			return(temp + sum_of_digit(n/10));
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be summed:");
		int n = sc.nextInt();
		System.out.println("Summation is:"+ sum_of_digit(n));
	}

	
}
