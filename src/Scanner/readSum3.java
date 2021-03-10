package Scanner;
import java.util.*;
public class readSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int sum = readSum3(console);
		String name = readName(console);
		System.out.println("The sum is : " + sum);
		System.out.println("And your name is : " + name);
		
	}
	
	public static int readSum3(Scanner console){
		System.out.print("Type three numbers:");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		int num3 = console.nextInt();
		return num1+num2+num3;
	}
	
	public static String readName(Scanner console){
		System.out.print("Type your name too: ");
		String name = console.next();
		return name;
	}
}
