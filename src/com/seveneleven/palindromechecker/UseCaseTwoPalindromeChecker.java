package com.seveneleven.palindromechecker;

public class UseCaseTwoPalindromeChecker {
	public static void main(String[] args) {
		String input ="mada";
		int size=input.length();
		for (int i=0; i<input.length()/2;i++) {
			if (input.charAt(i) != input.charAt(size - 1 - i)) {
				System.out.println("not a palindrome");
				return;
			}
		}
		System.out.println("Palindrome!");
	}
}
