package com.sample.algthms;

public class MultiplyNumbers {
    public static void main(String[] args) {
        // a * b; 2 * 3
        int a = 2;
        int b = -3;
        int negative=0;
        int positive=0;
        //System.out.println(0 == b ? 0 : a / (1 / b));
        if(a>0&&b>0) {
            positive = a;
        }
        else {
            negative = b;
        }
        int result = 0;
        for (int i = 0; i < positive; i++) {
            result += negative;
        }
        System.out.println(result);
    }
}
