package com.sample.arrays;

// two pinter technique
// I finds for non zero and swap
public class A09_ZeroesLast_14 {
	public static void main(String args[]) {
		int a[] = { 1, 2, 7, 0, 6, 88, 0, 2, 10, 0, 60 };
		int j = 0;
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}

//O(n) two pinter tech
