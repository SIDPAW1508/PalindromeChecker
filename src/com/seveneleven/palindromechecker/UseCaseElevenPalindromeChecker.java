package com.seveneleven.palindromechecker;

public class UseCaseElevenPalindromeChecker {
	public static void main(String[] args) {
		String input="level";
		PalindromeChecker checker = new PalindromeChecker();

        // Call method to check palindrome
        boolean result = checker.checkPalindrome(input);

        // Print result
        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        } 
	}
}
class PalindromeChecker{
	public boolean checkPalindrome(String input) {
		int start=0;
		int end=input.length()-1;
		boolean isPalindrome=true;
		while (start<end) {
			if (input.charAt(start)!=input.charAt(end)) {
				isPalindrome=false;
				return isPalindrome;
			}start++;
			end--;
		}return true;
	}
}