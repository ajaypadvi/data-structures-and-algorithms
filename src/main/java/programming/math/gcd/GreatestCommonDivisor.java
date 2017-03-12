package programming.math.gcd;

public class GreatestCommonDivisor {
	public static int gcd(int a, int b) {
		// n1 is always greater than n2
		int n1 = Math.max(a, b);
		int n2 = Math.min(a, b);

		while (n2 != 0) {
			int remainder = n1 % n2;
			n1 = n2;
			n2 = remainder;
		}
		return n1;
	}

	public static void main(String[] args) {
		System.out.println(gcd(45, 10));
	}
}
