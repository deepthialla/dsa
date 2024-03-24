package com.sample.algthms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Examples {
    public static void main(String[] args) {
//        Double transAmt = 200.9;
//        Double d = calculateRewards(transAmt);
//        System.out.println(d);
//
//        Long pts = Math.round(d);
//        System.out.println(pts);


        // https://stackify.com/streams-guide-java-8/

        Stream<Integer> intStream = Stream.of(1,2,3);

        List<Integer> list = List.of(1, 3, 1, 4, 5, 3, 0, 2);
        Transaction tr1 = new Transaction(1l, null, null, 100d, null);
        Transaction tr2 = new Transaction(1l, null, null, 200d, null);
        Transaction tr3 = new Transaction(1l, null, null, 90d, null);

        List<Transaction> listTrans = Arrays.asList(tr1, tr2, tr3);

        // Sum using streams
        System.out.println(listTrans.stream().mapToDouble(t -> t.getAmount()).sum());
        System.out.println("-----------");

        // Remove Duplicates
        list.stream().distinct().forEach( i -> System.out.println(i));
        System.out.println("-----------");

        // Find duplicates
        Set<Integer> temp = new HashSet<>();
        list.stream().filter(i -> !temp.add(i)).forEach(k -> System.out.println(k));
        list.stream().filter(i -> temp.add(i)).forEach(k -> System.out.println(k)); // Displays distinct
        System.out.println("-----------");

        // Find unique elements

        // Partitioning by
        Map<Boolean, List<Transaction>> map = listTrans.stream().collect(Collectors.partitioningBy(t -> t.getAmount() > 100d));
        map.forEach((k, v) -> System.out.println(k+" - "+v.size()));

        map.entrySet().forEach(e -> System.out.println(e.getKey()+"-"+e.getValue().size()));
        map.entrySet().stream().filter(e -> e.getKey()).collect(Collectors.toSet()).size();

        // Sort by key / value in map
        // Sort two dimentional or one dimentional array
    }

    private static Double calculateRewards(Double transAmt) {
        if(transAmt > 50 && transAmt <= 100) {
            return transAmt - 50;
        } else if(transAmt > 100) {
            return (2*(transAmt-100) + 50);
        } else
            return 0d;
    }
}
