package com.sample.algthms;

public class A06_Palindrome_15 {
	public static void main(String args[]) {
		String s = "mom";
		
		int i = 0;
		int j = s.length() - 1;
		boolean flag = true;
		
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				flag = false;
				break;
			}
		}
		
		if (flag == true) {
			System.out.println("pali");
		} else
			System.out.println("not");
	}

}
