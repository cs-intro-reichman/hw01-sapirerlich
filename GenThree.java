/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Declares 2 integer variables for the min and max of range, and sets them according to the command line argument and the min and max func
		int min_range = Math.min(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		int max_range = Math.max(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		//Calculates the range (not includes the max_range number)
		int range = max_range - min_range;
		// Randomize 3 integers in the range
		int random1 = (int)(Math.random() * range) + min_range;
		int random2 = (int)(Math.random() * range) + min_range;
		int random3 = (int)(Math.random() * range) + min_range;
		//Calculate the min integer out of the 3 randoms
		int min = Math.min(random1,random2); 
		min = Math.min(min,random3);
		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		System.out.println("The minimal generated number was " + min);
	}
}
