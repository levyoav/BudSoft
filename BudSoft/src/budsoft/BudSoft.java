package budsoft;

public class BudSoft {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.print(i + " : ");
			if(i % 15 == 0) {
				System.out.println("BudSoft");
			} else if((i % 3) == 0) {
				System.out.println("Bud");
			} else if((i % 5) == 0) {
				System.out.println("Soft");
			} else {
				System.out.println(i);
			}
		}
	}
}
