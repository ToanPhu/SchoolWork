import java.util.Scanner;

/* 
 *  universalMess.java
 *  java.util.Scanner is implemented in Java Platform SE 7, Versions below incompatible
 *  Math.PI is implemented in JavaScript 1.0, Versions below incompatible.
 *  
 *  Code by Toan Phu
 */
public class universalMess {

	public static void menu() throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("What shape would you like to work out the area of?");
		System.out.println("Available shapes :\n ----------------\n Triangle\n Square\n Circle\n");
		String shape = scan.nextLine();

		if ((shape.toLowerCase()).equals("circle")) {
			System.out.println("Input RADIUS");
			double r = scan.nextDouble();
			System.out.println("--------------------\nCalculated area of Circle =");
			System.out.println(Math.PI * (r * r));
			// End code for circle
		} else if ((shape.toLowerCase()).equals("square")) {
			System.out.println("Input side X");
			double x = scan.nextDouble();
			System.out.println("Input side Y");
			double y = scan.nextDouble();
			System.out.println("--------------------\nCalculated area of Square =");
			System.out.println(x * y);
			// End code for square
		} else if ((shape.toLowerCase()).equals("triangle")) {
			System.out.println("Input perpendicular height of triangle");
			double h = scan.nextDouble();
			System.out.println("Input base width of triangle");
			double w = scan.nextDouble();
			System.out.println("--------------------\nCalculated area of Triangle =");
			System.out.println(w * h / 2);
		} else {
			System.out.println("Shape not recognised.");
			Thread.sleep(1000);
			menu();
		}
		Thread.sleep(3000);
		System.out.println("--------------------\n");
		System.out.println("Would you like to calculate an area of another shape?\nYes\nNo");
		
		String response = scan.next();
		if ((response.toLowerCase()).equals("yes")) {
			menu();
		}
	}

	public static void main(String[] args) throws InterruptedException{
		menu();
	}
}
