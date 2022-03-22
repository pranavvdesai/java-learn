import java.io.*;
import java.util.*;

class Solution {
	public static void main(String[] args) {
		String s = "I am using hackerrank_sf to improve programming";
		String t = "am hackerrank to improve";
		List<String> str = missingwords(s, t);
		for (int i = 0; i < str.size(); i++)
			System.out.println(str.get(i));
	}

	public static List<String> missingwords(String s, String t) {
		s = s.trim();
		t = t.trim();
		if (t.length() == 0)
			return Arrays.asList(s.split(" "));

		String[] words = s.split(" ");
		String[] query = t.split(" ");

		int j = 0;

		List<String> to_return = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(query[j])) {
				j = j + 1;
			} else {
				to_return.add(words[i]);
			}
		}
		return to_return;
	}

}