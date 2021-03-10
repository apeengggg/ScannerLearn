package Scanner;
import java.util.*;
public class UserGuidCumulativeSum {

	private static Scanner console;

	public static void main(String[] args) {
		console = new Scanner(System.in);
		System.out.print("How many numbers to add? ");
		int count = console.nextInt();

		int sum = 0;
		for (int i = 1; i <= count; i++) {
		    System.out.print("Type a number: ");
		    sum = sum + console.nextInt();
		}
		System.out.println("The sum is " + sum);

	}

}
