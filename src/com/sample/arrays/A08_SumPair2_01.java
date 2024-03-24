package com.sample.arrays;


import java.util.HashMap;
import java.util.HashSet;

// Hashmap technique less time complexity
public class A08_SumPair2_01 {
	public static void main(String args[]) {
		
		int a[] = { 2, 5, 16, 3, 6 };
		int sum = 7;
		boolean flag = false;
		
		HashMap<Integer, Integer> s = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			int b = sum - a[i];
			if (s.containsKey(b)) {
				flag = true;
				System.out.println("" + b + "" + a[i]);
			} else
				s.put(a[i], i);
		}
		
		if (flag == true) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}

}
//Time complexity is O(n)