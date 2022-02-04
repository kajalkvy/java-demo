package com.dataStructure;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "aplep";
        System.out.println(check(s1, s2));
    }

    public static boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s1.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }

        }

        return true;
    }
}
