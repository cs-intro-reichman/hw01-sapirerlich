/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		 // Declares an integer variable and sets it according to the command line argument
		 int a = Integer.parseInt(args[0]);
		 int quarters = a / 25;
		 int cents = a % 25;
		 System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}
}