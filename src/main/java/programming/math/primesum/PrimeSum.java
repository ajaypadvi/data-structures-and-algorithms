package programming.math.primesum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrimeSum {
	public static ArrayList<Integer> primesum(int a) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

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
		for (int i = 2; i <= a; i++) {
			if (array[i] == 1 && array[a - i] == 1) {
				ArrayList<Integer> response = new ArrayList<Integer>();
				response.add(i);
				response.add(a - i);
				list.add(response);
			}
		}

		Collections.sort(list, new Comparator<ArrayList<Integer>>() {

			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				ArrayList<Integer> list1 = o1;
				ArrayList<Integer> list2 = o2;
				if ((list1.get(0) < list2.get(0)) || (list1.get(0) == list2.get(0)) && list1.get(1) < list2.get(2)) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		return list.size() > 0 ? list.get(0) : new ArrayList<Integer>();
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
		System.out.println(primesum(14));
	}
}
