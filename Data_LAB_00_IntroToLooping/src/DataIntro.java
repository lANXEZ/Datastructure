
public class DataIntro {
	public DataIntro() {
		// TODO Auto-generated constructor stub
		printHollowSquare(5);

	}

	public void makeMultTable(int M) {

		for (int i = 1; i <= M; i++) {

			System.out.printf("%d %d", i, i * M);
			System.out.println();

		}

	}

	public void deductK(int M, int k) {
		while (M > 0) {
			System.out.printf("%d\n", M);
			M = M - k;

		}

	}

	public void makeUpwardRightTriangle(int w) {
		for (int i = 1; i <= w; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}

	}

	public void makeDownwardRightTriangle(int w) {
		for (int i = 1; i <= w; i++) {
			System.out.println();
			for (int j = w; j >= i; j--) {
				System.out.print("*");
			}
		}

	}

	public void makeUpwardIsosceles(int w) {
		for (int i = 0; i <= w; i++) {
			for (int j = w; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++) {
				if (j > 0) {
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}

	public void calculatePower(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result = result * base;

		}
		System.out.println(result);
	}

	public void printHollowSquare(int N) {
		int lapCount = 0;
		int starCount = 0;
		while (true) {
			if (lapCount == 0 || lapCount == N-1) {
				while (starCount < N) {
					System.out.print("*");
					starCount++;
					
				}
				System.out.println();
				starCount = 0;
				lapCount++;
				
			}
			else if (lapCount > 0 && lapCount < N -1) {
				while (starCount < N) {
					if (starCount == 0 || starCount == N-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					starCount++;
				}
				starCount = 0;
				System.out.println();
				lapCount++;
				
			}
			else {
				lapCount = 0;
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		DataIntro myLab = new DataIntro();

		/*
		 * Checking Ex1: Remove the below block comment to test your makeMultTable
		 * method
		 */
		/*
		 * System.out.println("Exercise 1\n"); System.out.println("makeMultTable(63)");
		 * System.out.println("Your answer is "); makeMultTable(63);
		 * System.out.println("The Correct answer is "); System.out.println(
		 * "X\t63\n1\t63\n2\t126\n3\t189\n4\t252\n5\t315\n6\t378\n7\t441\n8\t504\n9\t567\n10\t630\n11\t693\n12\t756"
		 * ); System.out.println();
		 */

		/* Checking Ex2: Remove the below block comment to test your deductByK method */
		/*
		 * System.out.println("Exercise 2  deductK(105,8)");
		 * System.out.println("Your answer is "); deductK(105,8);
		 * System.out.println("The Correct answer is ");
		 * System.out.println("105 97 89 81 73 65 57 49 41 33 25 17 9 1");
		 * System.out.println();
		 */

		/*
		 * Checking Ex3: Uncomment the below block comment to test your deductByK method
		 */
		/*
		 * System.out.println("Exercise 3 makeUpwardRightTriangle(6)");
		 * System.out.println("Your answer is "); makeUpwardRightTriangle(6);
		 * System.out.println("The Correct answer is ");
		 * System.out.println("*\n**\n***\n****\n*****\n******\n");
		 * 
		 */

		/* Checking Ex4: Remove the below block comment to test your deductByK method */
		/*
		 * System.out.println("Exercise 4 makeDownwardRightTriangle(5)");
		 * System.out.println("Your answer is "); makeDownwardRightTriangle(5);
		 * System.out.println("The Correct answer is ");
		 * System.out.println("*****\n****\n***\n**\n*\n");
		 */

		/* Checking Ex5: Remove the below block comment to test your deductByK method */
		/*
		 * System.out.println("Exercise 5 makeUpwardIsosceles(4)");
		 * System.out.println("Your answer is "); makeUpwardIsosceles(4);
		 * System.out.println("The Correct answer is ");
		 * System.out.println("    *\n   ***\n  *****\n *******\n*********\n");
		 */

	}

}
