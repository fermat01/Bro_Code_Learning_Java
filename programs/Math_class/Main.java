import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO claculte the hypothenus of given input triangle
		double x ;
		double y ;
		double z;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter the side y: ");
		y = scanner.nextDouble();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("The hypothenus is : "+z);
		scanner.close();

	}

}