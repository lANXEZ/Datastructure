public class Recursion {
	// ex1
	static int subsumProduct;
	// ex2
	static int sumDigitProduct;

	static int subsum(int n) {
		// Ex1. Complete the content of this method
		if (n % 2 == 0 && n > 0) {
			subsumProduct = subsumProduct - n;
			n--;
			return subsum(n);
		} else if (n % 2 == 1 && n > 0) {
			subsumProduct = subsumProduct + n;
			n--;
			return subsum(n);
		} else {
			return subsumProduct;
		}

	}

	static int sumDigit(int n) {
		// Ex2. Complete the content of this method
		if (n > 0) {
			sumDigitProduct = sumDigitProduct + (n % 10);
			n = n / 10;
			return sumDigit(n);
		} else {
			return sumDigitProduct;
		}

	}

	public static int sumEven(int n) {
		// Ex3. Complete the content of this method
		if (n == 0) {
			return n;
		} else {
			if (n % 2 == 0) {
				return n + sumEven(n - 2);
			} else {
				return sumEven(n - 1);
			}
		}
	}

	public static void main(String[] args) {

		// Test Uncomment these lines below to test your subsum code

		System.out.println("Calculating subsum(10):");
		System.out.println("Your answer is " + subsum(10));
		System.out.println("The correct answer is -5");
		System.out.println("-----------------------");

		// Uncomment these lines below to test your sumDigit code

		System.out.println("sumDigit(123456789)");
		System.out.println("Your answer is " + sumDigit(123456789));
		System.out.println("The correct answer is 45");
		System.out.println("-----------------------");

		// Uncomment these lines below to test your sumEven code

		System.out.println("Calculating sumEven(10):");
		System.out.println("Your answer is " + sumEven(10));
		System.out.println("The correct answer is 30");

	}

}