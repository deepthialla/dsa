package com.sample.arrays;

import java.util.Arrays;

// Two pointer technique
public class A08_SumPair_01 {
	public static void main(String args[]) {
		int a[] = { 2, 6, 4, 1, 5 };
		
		int sum = 2;
		Arrays.sort(a);

		int i = 0;
		int j = a.length - 1;
		
		boolean flag = false;

		while (i < j) {
			if (a[i] + a[j] == sum) {
				flag = true;
				break;
			} else if (a[i] + a[j] < sum) {
				i++;
			} else
				j--;
		}

		if (flag == true) {

			System.out.println(a[i] + "paired num" + a[j]);
		} else {
			System.out.println("not found");
		}

	}
}

//Complexity O(nlogn)
