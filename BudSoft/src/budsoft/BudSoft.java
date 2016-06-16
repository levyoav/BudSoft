package budsoft;

/*
 * Iterates over int numbers from 1 to 100 and prints "Bud" for numbers that are multiples of 3,
 * "Soft" for number that are multiples of 5 and "BudSoft" for numbers that are multiples of both.
 */
public class BudSoft {
	public static void main(String[] args) {
		//Iterating over in numbers between 1-100.
		for(int i=1; i<=100; i++) {
			System.out.print(i + " : "); //Prints out the current number for verification.
			
			//Check if the current number is a multiple of both 3 and 5.
			if(i % 15 == 0) {
				System.out.println("BudSoft");
			
			//Check if the current number is a multiple of 3.
			} else if((i % 3) == 0) {
				System.out.println("Bud");
				
			//Check if the current number is a multiple of 5.
			} else if((i % 5) == 0) {
				System.out.println("Soft");
			
			//Prints the number that is not a multiple of neither 3 or 5.
			} else {
				System.out.println(i);
			}
		}
	}
}
