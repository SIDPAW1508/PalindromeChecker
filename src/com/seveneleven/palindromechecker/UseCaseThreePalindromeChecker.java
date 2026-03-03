package com.seveneleven.palindromechecker;

public class UseCaseThreePalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}