package com.sample.algthms;

// Reverse the words
//output:  place new a is This
public class A03_ReverseWordsString_17_01_11 {
	public static void main(String args[]) {
		String s = " This is a new place";
		String[] words = s.split(" ");
		
		int start = 0;
		int end = words.length - 1;
		String swap;
		//sample
		while (start < end) {
			swap = words[start];
			words[start] = words[end];
			words[end] = swap;
			start++;
			end--;
		}
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].trim().length() > 0)
				System.out.print(words[i] + " ");
		}
		
	}
}
