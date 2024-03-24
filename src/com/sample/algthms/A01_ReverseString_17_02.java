package com.sample.algthms;
// Full reverse of string
// output: ecalp wen a si sihT
public class A01_ReverseString_17_02 {

	public static void main(String args[]) {
		String s = "This is a new place";
		char[] ch = s.toCharArray();

		int start = 0;
		int end = s.length() - 1;
		char temp;

		while (start < end) {
			temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;

		}
		System.out.println(ch);
	}
}

// Two pointer technique - O(logn)
// Second approach: convert to chararray. append to SB - not good approach
// Third approach: sb.reverse()

