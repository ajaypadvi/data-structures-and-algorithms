package programming.math.primenumbers;

import java.util.ArrayList;

public class PrimeNumbers {
	public static ArrayList<Integer> sieve(int a) {
		ArrayList<Integer> response = new ArrayList<Integer>();

		int[] array = new int[a + 1];
		for (int i = 1; i <= a; i++) {
			// Marking all numbers as prime for now
			array[i] = 1;
		}
		array[1] = 0;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			int isPrime = isPrime(i);
			if (isPrime == 1) {
				array[i] = 1;
				for (int j = 2; i * j <= a; j++) {
					array[i * j] = 0;
				}
			}
		}

		for (int i = 1; i < array.length; i++) {
			if (array[i] == 1) {
				response.add(i);
			}
		}
		return response;
	}

	public static int isPrime(int a) {
		boolean isPrime = true;
		if (a <= 1) {
			return 0;
		}
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime ? 1 : 0;
	}

	public static void main(String[] args) {
		System.out.println(sieve(15));
	}
}
