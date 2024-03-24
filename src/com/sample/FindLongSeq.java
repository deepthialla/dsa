package com.sample;

public class FindLongSeq {
    public static void main(String[] args) {
        FindLongSeq s = new FindLongSeq();
    }

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int realCounter = 0;
        int tempCounter = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                if (i > 0 && binary.charAt(i - 1) == '1') {
                    tempCounter++;
                } else {
                    if (tempCounter > 0) tempCounter++;
                }
            } else if (binary.charAt(i) == '1') {
                if (tempCounter > 0 && tempCounter > realCounter) {
                    realCounter = tempCounter;
                }
                tempCounter = 0;
            }
        }
        return realCounter;
    }
}
