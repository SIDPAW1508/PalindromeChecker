package com.seveneleven.palindromechecker;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Description:
 * This class demonstrates palindrome validation using a Deque
 * (Double Ended Queue).
 *
 * A Deque allows insertion and removal of elements from both
 * the front and the rear of the data structure.
 *
 * In this implementation:
 * - Characters of the input string are added to the deque.
 * - The first and last characters are removed and compared.
 * - If all corresponding characters match, the string is a palindrome.
 *
 * This approach is efficient because it uses a single data structure
 * to perform symmetric comparison.
 */
public class UseCaseSevenPalindromeChecker {

    public static void main(String[] args) {

        // Input string to check for palindrome
        String input = "madam";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Convert the string into characters and insert them into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c); // Add character to the rear of the deque
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters from front and rear while more than one element exists
        while (deque.size() > 1) {

            // Remove character from the front
            char front = deque.removeFirst();

            // Remove character from the rear
            char rear = deque.removeLast();

            // Compare the two characters
            if (front != rear) {
                // If characters do not match, it is not a palindrome
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}