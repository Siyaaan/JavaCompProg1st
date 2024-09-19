package CodeChum;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String userInput = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("You entered: " + userInput);
		System.out.println("Your age is: " + age);

		scanner.close();
	}
}
