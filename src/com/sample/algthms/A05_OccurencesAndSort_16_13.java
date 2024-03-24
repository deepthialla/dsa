package com.sample.algthms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// Sort by key
public class A05_OccurencesAndSort_16_13 {
	public static void main(String args[]) {
		String input = "aaabgghjjjyyyder";
		//Comparator.reverseOrder()
		Map<Character,Integer> map = new TreeMap<>();
		//Map<Character,Integer> map = new TreeMap<>();
		
		for(char c : input.toCharArray()) {
			//map.put(c, map.getOrDefault(c, 0) + 1);
			if(map.get(c)==null) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
	
		System.out.println(map);
		
		StringBuilder sb = new StringBuilder();
		for(Entry<Character,Integer> s : map.entrySet()) {
			for(int i =  0;i < s.getValue();i++) {
			sb.append(s.getKey());
		}
		}
	    System.out.println(sb);
	}
}
