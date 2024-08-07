import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// While loop = executes a block of code as loop as it's condition remains true
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		System.out.println("hey hi "+ name);

	}

}