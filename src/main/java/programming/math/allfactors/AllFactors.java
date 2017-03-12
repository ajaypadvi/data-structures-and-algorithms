package programming.math.allfactors;

import java.util.ArrayList;
import java.util.Collections;

public class AllFactors {
	public static ArrayList<Integer> allFactors(int a) {
		ArrayList<Integer> response = new ArrayList<Integer>();
		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				response.add(i);
				if (i != Math.sqrt(a)) {
					response.add(a / i);
				}
			}
		}
		Collections.sort(response);
		return response;
	}

	public static void main(String[] args) {
		System.out.println(allFactors(12));
		System.out.println(allFactors(17));
		System.out.println(allFactors(36));
	}
}
