package com.sample.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByKeyAndValue {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 10);
        map.put(1,9);
        map.put(5,2);
        map.put(4,11);

        //sort by key - #1 - using TreeMap
        TreeMap<Integer, Integer> sortedTreeMap = new TreeMap<>(); // assending
        sortedTreeMap.putAll(map);

        for(Map.Entry<Integer, Integer> entrySet : sortedTreeMap.entrySet())
            System.out.println(entrySet.getKey()+" - "+entrySet.getValue());

        System.out.println("--------------------");

        //TreeMap<Integer, Integer> sortedTreeMapDesc = new TreeMap<>((e1, e2) -> e2.compareTo(e1)); // Decending
        TreeMap<Integer, Integer> sortedTreeMapDesc = new TreeMap<>(Comparator.reverseOrder()); // Decending
        sortedTreeMapDesc.putAll(map);

        sortedTreeMapDesc.entrySet().forEach(e -> System.out.println(e.getKey()+" - "+e.getValue()));

        System.out.println("--------------------");

        // Sort by key - #2 - using Streams

        // Ascending order
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.println(e.getKey() + " - "+e.getValue()));

        System.out.println("--------------------");

        //Decending order - using comparator

      map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey((i1, i2) -> i2.compareTo(i1)))
        .forEach(e -> System.out.println(e.getKey() + " - "+e.getValue()));

        System.out.println("--------------------");

        //Descending order - using comparator.reverseOrder
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey() + " - "+e.getValue()));

        System.out.println("--------------------");

        // Sort by value - using collections.sort

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Ascending order
        Collections.sort(list, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));
        Collections.sort(list, Map.Entry.comparingByValue());
        list.forEach(e -> System.out.println(e.getKey() +" - "+e.getValue()));

        System.out.println("--------------------");

        //Descending order
        //Collections.sort(list, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        Collections.sort(list, Map.Entry.comparingByValue(Comparator.reverseOrder()));
        list.forEach(e -> System.out.println( e.getKey() +" - "+e.getValue()));

        System.out.println("--------------------");

        // Sort by value - using java8

        //Ascending order
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach( e -> System.out.println(e.getKey()+" - "+e.getValue()));

        System.out.println("--------------------");

        //Descending order
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach( e -> System.out.println(e.getKey() +" - "+e.getValue()));

        System.out.println("--------------------");

        // Filter
        System.out.println(map.entrySet()
                .stream().filter( e -> e.getValue() > 3)
                .sorted(Map.Entry.comparingByKey())
                .map(e -> e.getKey()).collect(Collectors.toList()));

    }
}
