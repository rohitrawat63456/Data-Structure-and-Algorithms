package DataStructureAndAlgorithms;

public class ValidPallindromeII {
	public static boolean check(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static boolean validPalindrome(String str) {
		if (check(str))
			return true;
		int i = 0, j = str.length() - 1;
		while (str.charAt(i) == str.charAt(j)) {
			i++;
			j--;
		}
		return check(str.substring(0, i) + str.substring(i + 1)) || check(str.substring(0, j) + str.substring(j + 1));
	}

	public static void main(String[] args) {
		System.out.print(validPalindrome("nitin"));

	}

}
