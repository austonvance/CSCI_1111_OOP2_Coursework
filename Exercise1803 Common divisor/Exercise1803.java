import java.util.Scanner;

public class Exercise1803 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int m = Integer.parseInt(input.next());
		int n = Integer.parseInt(input.next());

		// Calucate and display the GCD
		System.out.println("The greatest common divisor of " + m + " and " + n 
			+ " is " + gcd(m, n));
	}

	/** Method for computing GCD */
	private static int gcd(int m, int n) {
		if (m % n == 0)
			return n; // Base case
		else // Recursive call
			return gcd(n, m % n);
	}
}