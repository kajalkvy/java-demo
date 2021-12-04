package com.dataStructure;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome string= new Palindrome();
        String s1 = "madam";
        String s2 = "kajal";
        System.out.println(string.isPalindrome(s1));
        System.out.println(string.isPalindrome(s2));
    }

    public boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length()-1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
