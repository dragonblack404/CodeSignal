package dad.codesignal;

public class TheJourneyBegins {

	public int add(int a, int b) {
		return a + b;
	}

	public int centuryFromYear(int year) {
		int siglo = year / 100;
		if (year % 100 != 0) {
			siglo += 1;
		}
		return siglo;
	}

	public boolean palindrome(String s) {
		String reverse="", original = s;
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		return original.equals(reverse);
	}
}
