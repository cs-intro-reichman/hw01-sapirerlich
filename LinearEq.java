/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
	 // Declares 3 double variables and sets them according to the command line argument
	 double a = Double.parseDouble(args[0]);
	 double b = Double.parseDouble(args[1]);
	 double c = Double.parseDouble(args[2]);
	 // Calculate x based on the equation 
	 double x = (c - b) / a;
	 System.out.println(a + " * x + " + b + " = " + c);
	 System.out.println("x = " + x);
	}
}