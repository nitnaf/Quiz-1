
import java.util.Scanner;

public class QBRating {
	
	public static void main(String[] args) {
			
		// New Scanner Class
		Scanner keyboard = new Scanner(System.in);
				
		// Attempts
		System.out.println("Number of passing attempts?");
		double attempts = keyboard.nextDouble();
		
		// Completions
		System.out.println("Number of completions?");
		double comps = keyboard.nextDouble();
		
		// Yards Thrown
		System.out.println("Number of passing yards?");
		double yards = keyboard.nextDouble();
		
		// Touchdown Passes Thrown
		System.out.println("Number of touchdown passes?");
		double tds = keyboard.nextDouble();
		
		// Interceptions Thrown
		System.out.println("Number of interceptions thrown?");
		double ints = keyboard.nextDouble();
		
		// Set MM
		System.out.println("Set scale - Min of '0', Max of '2.375'.");
		double mm = keyboard.nextDouble();
		while ((mm < 0) || (mm > 2.375)) {
			System.out.println("Please enter a value between 0 and 2.375.");
			mm = keyboard.nextDouble();
		}

		// Calculating QBR
		double a = ((comps/attempts) - .3) * 5;
		double b = ((yards/attempts) - 3) * .25;
		double c = (tds/attempts) * 20;
		double d = 2.375 - ((ints/attempts) * 25);
		
		double answer = (((mm*a)+(mm*b)+(mm*c)+(mm*d))/6) * 100;
		System.out.println("Passer Rating: "+ answer);
	}

}
