package com.sample.algthms;

public class A10_CountsOnesZeros {
    public static void main(String[] args) {
        String str = "10100001111";

        int oneCount = 0;
        int zerosCount = 0;
        for(char ch : str.toCharArray()) {
            if('0' == ch)
                oneCount++;
            else if('1' == ch)
                zerosCount++;
        }

        System.out.println("one counts:"+oneCount);
        System.out.println("Zeros counts:"+zerosCount);
    }
}
