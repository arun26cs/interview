package com.java.interview;

import java.util.HashMap;

public class Ceaser {

	public static void main(String[] args) {
		String s = "abc";
		int k = 52;
		System.out.println(caesarCypherEncryptor(s, k));
	}

	public static String caesarCypherEncryptor(String str, int key) {
		char[] alphas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		HashMap<Character, Integer> alphabets = new HashMap<Character, Integer>();
		alphabets.put('a', 1);
		alphabets.put('b', 2);
		alphabets.put('c', 3);
		alphabets.put('d', 4);
		alphabets.put('e', 5);
		alphabets.put('f', 6);
		alphabets.put('g', 7);
		alphabets.put('h', 8);
		alphabets.put('i', 9);
		alphabets.put('j', 10);
		alphabets.put('k', 11);
		alphabets.put('l', 12);
		alphabets.put('m', 13);
		alphabets.put('n', 14);
		alphabets.put('o', 15);
		alphabets.put('p', 16);
		alphabets.put('q', 17);
		alphabets.put('r', 18);
		alphabets.put('s', 19);
		alphabets.put('t', 20);
		alphabets.put('u', 21);
		alphabets.put('v', 22);
		alphabets.put('w', 23);
		alphabets.put('x', 24);
		alphabets.put('y', 25);
		alphabets.put('z', 26);

		StringBuilder sbuild = new StringBuilder();
		int fin = 0;
		for (int i = 0; i < str.length(); i++) {
			int idx = alphabets.get(str.charAt(i));
			if ((idx + key) > 26) {
				int tominus = (idx + key) % (alphas.length);
				fin = tominus;

			} else {
				fin = idx + key;
			}
			sbuild.append(alphas[fin-1]);
		}
		return sbuild.toString();
	}
}
