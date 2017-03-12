package programming.math.allfactors.binaryrepresentation;

import java.util.ArrayList;

/**
 * Any integer to binary representation conversion
 * <p>
 * Decimal to Decimal
 * </p>
 * <p>
 * Decimal to Binary
 * </p>
 */
public class BinaryRepresentation {
	public static String findDigitsInBinary(int a) {
		StringBuilder response = new StringBuilder();
		if (a == 1 || a == 0) {
			return String.valueOf(a);
		}
		int remainder;
		int quotient;
		while (a > 0) {
			quotient = a / 2;
			remainder = a % 2;
			a = quotient;
			response.append(String.valueOf(remainder));
		}
		return response.reverse().toString();
	}

	public static ArrayList<ArrayList<Integer>> squareSum(int A) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

		for (int a = 0; a * a <= A / 2; a++) {
			for (int b = 0; b * b < A; b++) {
				if (a * a + b * b == A) {
					ArrayList<Integer> newEntry = new ArrayList<Integer>();
					newEntry.add(a);
					newEntry.add(b);
					ans.add(newEntry);
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(squareSum(2));
		// System.out.println(findDigitsInBinary(3));
		// System.out.println(findDigitsInBinary(6));
		// System.out.println(findDigitsInBinary(125));
	}

}
