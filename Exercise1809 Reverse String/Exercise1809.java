import java.util.Scanner;

public class Exercise1809 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String value = input.next();

		// Display the value reversely
		reverseDisplay(value);
	}

	/** Method displays the characters in a string reversely */
	private static void reverseDisplay(String value) {
		if (value.length() == 1) // Base case
			System.out.println(value);
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1)); // Recursive call
		}
	}
}