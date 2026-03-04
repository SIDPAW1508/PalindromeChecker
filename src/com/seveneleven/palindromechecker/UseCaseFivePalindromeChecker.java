package com.seveneleven.palindromechecker;

import java.util.Stack;

public class UseCaseFivePalindromeChecker {
	public static void main(String[] srgs) {
		String word="noone";
		Stack <Character> stack =new Stack<>();
		for (char c: word.toCharArray()) {
			stack.push(c);
		}
		for (char c:word.toCharArray()) {
			if (c!=stack.peek()) {
				System.out.println("not a palindrome");
				return;
			}
			stack.pop();
		}
		System.out.println("It is a palindrome");
		
	}
}
