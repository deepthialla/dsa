package com.sample;

import java.util.HashSet;
import java.util.Set;

public class SampleHello {
    public static void main(String[] args) {

        System.out.println("");

/*         String str = "abcdrf drf jkl";
         String find = "drf";

        System.out.println(str.indexOf(find));

        int i = 0;
        i++;
        System.out.println(i);
        if(i == 1)
            System.out.println("true");

        int[] A = {1, 3, 6, 4, 1, 2};
        SampleHello s = new SampleHello();
        System.out.println(s.solution(A));*/

    }

    public int solution(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }

        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}
