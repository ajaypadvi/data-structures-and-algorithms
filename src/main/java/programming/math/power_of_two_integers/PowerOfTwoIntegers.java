package programming.math.power_of_two_integers;

public class PowerOfTwoIntegers {
	public static boolean isPower(int a) {
		if (a == 1) {
			return true;
		}
		boolean response = false;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			int power = 0;
			for (int j = 2; (power = (int) Math.pow(i, j)) <= a; j++) {
				if (power == a) {
					response = true;
					break;
				}
			} 	
		}
		return response;
	}

	public static void main(String[] args) {
		System.out.println(isPower(49));
	}
}
