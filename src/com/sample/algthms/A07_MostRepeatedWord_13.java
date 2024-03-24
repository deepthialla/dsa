package com.sample.algthms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class A07_MostRepeatedWord_13 {

	public static void main(String[] args) {
		String input = "aa bb aa dd dd aa";

		Map<String,Integer> map = new HashMap<>();
		
		for(String c : input.split(" ")) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
	    List<Entry<String,Integer>> m = new ArrayList<>(map.entrySet());
		System.out.println(m);
		
		Collections.sort(m,new Comparator<Entry<String,Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				//return o2.getValue() -o1.getValue();
				if(o1.getValue() < o2.getValue())
					return 1;
				else
					return -1;
			}
			
		});
		
		System.out.println(m);
		System.out.println(m.get(0).getKey()+" repeated "+m.get(0).getValue()+" times");
	}
	
	
}
