package com.sample.hackerrank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

        Note that the same word in the dictionary may be reused multiple times in the segmentation.



        Example 1:

        Input: s = "leetcode", wordDict = ["leet","code"]
        Output: true
        Explanation: Return true because "leetcode" can be segmented as "leet code".
        Example 2:

        Input: s = "applepenapple", wordDict = ["apple","pen"]
        Output: true
        Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
        Note that you are allowed to reuse a dictionary word.
        Example 3:

        Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
        Output: false*/
public class H18_WordBreak {
    public static void main(String[] args) {
        //Solution 1: https://stackoverflow.com/questions/39380031/leetcode-139-word-break
        //Other solutions using Dynamic programing:
        // https://www.geeksforgeeks.org/word-break-problem-dp-32/


    }

    // Solution 1 from stack over flow
    private static boolean test(String str, Set<String> set) {
        int i = 1;
        int start = 0;
        List<String> tokens = new ArrayList<>();

        while (i <= str.length()) {
            String substring = str.substring(start, i);
            if (set.contains(substring)) {
                tokens.add(substring);
                start = substring.length();
            }
            i++;
        }

        String abc = "";
        for (String a : tokens) {
            abc = abc + a;
        }

        System.out.println(abc);

        if (abc.equals(str)) {
            return true;
        } else {
            return false;
        }
    }



    // Solution 2: Dynamic programming - mark to eliminate the duplicate work
    public static boolean wordBreak(String s, List<String> dictionary) {
        // create a dp table to store results of subproblems
        // value of dp[i] will be true if string s can be segmented
        // into dictionary words from 0 to i.
        boolean[] dp = new boolean[s.length() + 1];

        // dp[0] is true because an empty string can always be segmented.
        dp[0] = true;

        for(int i = 0; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && dictionary.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
