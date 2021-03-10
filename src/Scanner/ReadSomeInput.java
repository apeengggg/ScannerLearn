package Scanner;
import java.util.*;

public class ReadSomeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.print("How old are you?  ");
		int age = console.nextInt();
		
		System.out.println(age + "... That's quite old!");
	}

}
