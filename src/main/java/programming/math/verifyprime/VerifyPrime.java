package programming.math.verifyprime;

public class VerifyPrime {
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
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(6));
		System.out.println(isPrime(12));
		System.out.println(isPrime(13));
	}
}
