package com.junit.mock.DemoDictionary;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PermutationCombination {

	private TreeMap<String, String> map = new TreeMap<String, String>();

	public ArrayList<String> getPossibleWords(String s) {

		ArrayList <String> possibleWords = new ArrayList <String> ();
		
		s = s.toLowerCase();
		
		permute("", s);
		
		for (Entry<String, String> m : map.entrySet()) {
			
			possibleWords.add(m.getKey());
			System.out.println(m.getKey());
		}
		
		return possibleWords;
	}

	private void combo(String prefix, String s) {
		int N = s.length();

		map.put(prefix, "");

		for (int i = 0; i < N; i++)
			combo(prefix + s.charAt(i), s.substring(i + 1));
	}

	private void permute(String prefix, String s) {
		int N = s.length();

		if (N == 0) {
			combo("", prefix);
		}

		for (int i = 0; i < N; i++)
			permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, N));
	}

	
}
