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

// Sort by Value
public class A04_OccurencesAndSort_16_12 {
	public static void main(String args[]) {
		String input = "aaabgghjjjyyyder";
		Map<Character,Integer> map = new HashMap<>();
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
		
	    List<Entry<Character,Integer>> m = new ArrayList<>( map.entrySet());
		System.out.println(m);
		
		Collections.sort(m, new Comparator<Entry<Character,Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				//System.out.println(o1.getKey()+"-"+o1.getValue()+"  "+o2.getKey()+"-"+o2.getValue());
				return o2.getValue() - o1.getValue();
			}
		});
		
		System.out.println(m);
		
		// Max occurances char
		System.out.println(m.get(0).getKey()+" occured times "+m.get(0).getValue());
		
		StringBuilder sb = new StringBuilder();
		for(Entry<Character,Integer> s : m) {
			for(int i =  0;i < s.getValue();i++) {
			sb.append(s.getKey());
		}
		}
	    System.out.println(sb);
	}
}
