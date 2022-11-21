package dad.codesignal;

import java.util.ArrayList;
import java.util.Collections;

public class SmoothSailing {

	public String[] allLongestStrings(String[] inputArray) {
		String[] sol;
		ArrayList<Integer> indices = new ArrayList<Integer>();
		int size = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (indices.isEmpty()) {
				indices.add(i);
				size = inputArray[i].length();
			} else if (size == inputArray[i].length())
				indices.add(i);
			else if (size < inputArray[i].length()) {
				indices.clear();
				indices.add(i);
				size = inputArray[i].length();
			}
		}
		sol = new String[indices.size()];
		for (int i = 0; i < indices.size(); i++) {
			sol[i] = inputArray[indices.get(i)];
		}
		return sol;
	}

	public int commonCharacterCount(String s1, String s2) {
		int sol = 0;
		ArrayList<Character> as2 = new ArrayList<Character>();
		for (int i = 0; i < s2.length(); i++) {
			as2.add(s2.charAt(i));
		}
		for (int k = 0; k < s1.length(); k++) {
			for (int k2 = 0; k2 < as2.size(); k2++) {
				if (0 == Character.compare(s1.charAt(k), as2.get(k2))) {
					sol++;
					as2.remove(k2);
					break;
				}
			}
		}
		return sol;
	}

	public boolean isLucky(int n) {
		String s;
		int n1 = 0, n2 = 0, mitad;

		s = n + "";
		mitad = s.length() / 2;
		for (int i = 0, j = s.length() - 1; i < mitad; i++, j--) {
			n1 = (int) s.charAt(i) + n1;
			n2 = (int) s.charAt(j) + n2;
		}
		if (n1 == n2)
			return true;
		return false;
	}

	public int[] sortByHeight(int[] a) {
		int[] sol = new int[a.length];
		ArrayList<Integer> indices = new ArrayList<Integer>();
		ArrayList<Integer> asol = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == -1)
				sol[i] = a[i];
			else {
				asol.add(a[i]);
				indices.add(i);
			}
		}
		Collections.sort(asol);
		for (int i = 0; i < asol.size(); i++) {
			sol[indices.get(i)] = asol.get(i);
		}
		return sol;
	}

	public String reverseInParentheses(String inputString) {
		for(int i = 0; i < inputString.length(); i++) {
            if(inputString.toCharArray()[i] == ')') {
                inputString = inputString.substring(0, i) + inputString.substring(i + 1);
                i--;
                String reversed = "";
                while(inputString.toCharArray()[i] != '(') {
                    reversed += inputString.toCharArray()[i];
                    inputString = inputString.substring(0, i) + inputString.substring(i + 1);
                    i --;
                }
                inputString = inputString.substring(0, i) + reversed + inputString.substring(i + 1);
                i += reversed.length() - 1;
            }
        }
        return inputString;
    }

}
