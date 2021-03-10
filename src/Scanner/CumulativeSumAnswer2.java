package Scanner;
import java.util.*;

public class CumulativeSumAnswer2 {
	public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hours1 = processEmployee(console, 1);
        int hours2 = processEmployee(console, 2);
        int total = hours1 + hours2;
        System.out.println("Total hours for both = " + total);
    }
//Reads hours information about an employee with the given number.
// Returns total hours worked by the employee.

public static int processEmployee(Scanner console, int number) {
    System.out.print("Employee " + number + ": How many days? ");
    int days = console.nextInt();
    
    // totalHours is a cumulative sum of all days' hours worked.
    int totalHours = 0;
    for (int i = 1; i <= days; i++) {
        System.out.print("Hours? ");
        int hours = console.nextInt();
        totalHours = totalHours + Math.min(hours, 8);
    }
    
    double hoursPerDay = (double) totalHours / days;
    System.out.printf("Employee %d's total hours = %d (%.1f / day)\n",
                      number, totalHours, hoursPerDay);
    System.out.println();
    return totalHours;
}
}
