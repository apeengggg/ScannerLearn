package Scanner;
import java.util.*;
public class ScannerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.print("Please type three numbers: ");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		int num3 = console.nextInt();
		
		int sum = num1+num2+num3;
		System.out.println("The Sum Is: " + sum);
	}	

}
