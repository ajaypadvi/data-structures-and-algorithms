package programming.mathtrailing_zeroes_in_factorial;

public class TrailingZeroes {

	public static int trailingZeroes(int a) {
		int result = 0;
		for (int i = 5; a / i >= 1; i *= 5) {
			result += a / i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(trailingZeroes(5));
		System.out.println(trailingZeroes(11));
		System.out.println(trailingZeroes(23));
		System.out.println(trailingZeroes(100));
	}
}
