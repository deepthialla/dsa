package com.sample.algthms;

// Reverse each word in a string
public class A02_ReverseWordString_17_03 {
	public static void main(String args[]) {
		String s = "This is a new place";
		String[] words = s.split(" ");

		System.out.println(words.length);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= words.length - 1; i++) {
			String rev = reverse(words[i]);
			sb.append(rev + " ");
		}
		
		System.out.println(sb.toString().trim());
	}

	public static String reverse(String str) {
		char[] ch = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		char temp;
		while (start < end) {
			temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}

		return new String(ch);

	}
}

//leetcode 557
// another approach using stack
// Another approach using two pointer - Knowledge center
