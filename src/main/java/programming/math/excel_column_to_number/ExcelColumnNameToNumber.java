package programming.math.excel_column_to_number;

public class ExcelColumnNameToNumber {
	public static int titleToNumber(String a) {
		int number = 0;
		for (int i = 0; i < a.length(); i++) {
			number = number * 26 + (a.charAt(i) - ('A' - 1));
		}
		return number;
	}

	public static void main(String[] args) {
		//System.out.println(titleToNumber("Z"));
		System.out.println(titleToNumber("AA"));
		//System.out.println(titleToNumber("AB"));
	}
}
