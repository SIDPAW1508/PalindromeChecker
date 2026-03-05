package com.seveneleven.palindromechecker;
import java.util.*;
public class UseCaseTwelvePalindromeChecker {

    public static void main(String[] args) {
        String input = "madam";

        // Use Stack-based strategy
        PalindromeStrategy strategy = new StackStrategy();

        // Check palindrome
        boolean result = strategy.check(input);

        // Print result
        if (result) {
            System.out.println(input + " is a palindrome according to stack strategy.");
        } else {
            System.out.println(input + " is NOT a palindrome according to stack strategy.");
        }
        PalindromeStrategy strategy1=new DequeStrategy();
        boolean result1 = strategy.check(input);

        // Print result
        if (result1) {
            System.out.println(input + " is a palindrome according to deque strategy.");
        } else {
            System.out.println(input + " is NOT a palindrome according to deque strategy.");
        }
    }
}
interface PalindromeStrategy{
	public boolean check(String input);
}
class StackStrategy implements PalindromeStrategy{
	public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from stack and compare with original
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {  // peek+pop in one step
                return false;        // mismatch found
            }
        }

        return true; // all characters matched
    }
}
class DequeStrategy implements PalindromeStrategy{
	public boolean check(String input) {
		Deque<Character> deque = new ArrayDeque<>();

        // Convert the string into characters and insert them into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c); // Add character to the rear of the deque
        }


        // Compare characters from front and rear while more than one element exists
        while (deque.size() > 1) {

            // Remove character from the front
            char front = deque.removeFirst();

            // Remove character from the rear
            char rear = deque.removeLast();

            // Compare the two characters
            if (front != rear) {
                return false;
            }
        }return true;
    
	}
}