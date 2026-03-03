package com.seveneleven.palindromechecker;

public class UseCaseFourPalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            if (chars[left] != chars[right]) {
                System.out.println(input + " is NOT a palindrome");
                return; // stop early if mismatch found
            }
            left++;
            right--;
        }
        
        System.out.println(input + " is a palindrome");
    }
}