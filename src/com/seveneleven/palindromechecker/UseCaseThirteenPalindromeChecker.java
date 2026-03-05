package com.seveneleven.palindromechecker;

import java.util.*;

public class UseCaseThirteenPalindromeChecker {

    public static void main(String[] args) {

        // Example input string (use a long string for performance testing)
        String input = "madammadammadammadammadammadammadammadam";

        // Stack-based strategy
        PalindromeStrategy stackStrategy = new StackStrategy();
        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.check(input);
        long endStack = System.nanoTime();
        System.out.println("Stack Strategy: " + (stackResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution time (Stack): " + (endStack - startStack) + " ns\n");

        // Deque-based strategy
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        long startDeque = System.nanoTime();
        boolean dequeResult = dequeStrategy.check(input);
        long endDeque = System.nanoTime();
        System.out.println("Deque Strategy: " + (dequeResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution time (Deque): " + (endDeque - startDeque) + " ns");
    }
}

/**
 * Palindrome strategy interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based palindrome checker
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Deque-based palindrome checker
 */
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        // Add all characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear characters
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}