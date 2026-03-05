package com.seveneleven.palindromechecker;

public class UseClassTenPalindromeChecker {

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Normalize the string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using simple two-pointer method
        if (isPalindrome(normalized)) {
            System.out.println("\"" + input + "\" is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }

    // Checks palindrome by comparing characters from start and end
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true; // all matched
    }
}