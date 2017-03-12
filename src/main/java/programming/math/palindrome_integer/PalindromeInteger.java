package programming.math.palindrome_integer;

public class PalindromeInteger {
	public static boolean isPalindrome(int a) {
		String number = Integer.toString(a);
		if (number.length() < 2) {
			return true;
		}
		boolean isPalindrome = true;
		for (int k = 0; k < number.length() / 2; k++) {
			if (number.charAt(k) == number.charAt((number.length() - 1) - k)) {
				continue;
			} else {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(12121));
	}
}
