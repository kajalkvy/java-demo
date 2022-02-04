package com.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class CheckCharOfFirstStringInSecondString {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "aplepc";
        System.out.println(check(s1, s2));
    }

    public static boolean check(String s1, String s2) {

        if(s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (map1.get(s1.charAt(i)) == null) {
                map1.put(s1.charAt(i), 1);
            } else {
                int value = map1.get(s1.charAt(i));
                map1.put(s1.charAt(i), value + 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (map2.get(s2.charAt(i)) == null) {
                map2.put(s2.charAt(i), 1);
            } else {
                int value = map2.get(s2.charAt(i));
                map2.put(s2.charAt(i), value + 1);
            }
        }

        System.out.println(map1);
        System.out.println(map2);

        for(int i=0;i<s1.length();i++) {
            if(map2.get(s1.charAt(i))==null || !(map2.get(s1.charAt(i)) >= map1.get(s1.charAt(i)))){
                return false;
            }
        }

        return true;
    }
}
// lalal
