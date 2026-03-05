# UC12: Stack & Deque-Based Palindrome Checker

## Description
This feature demonstrates **palindrome checking using two strategies**:

1. **Stack-Based Strategy**: Uses a `Stack` to compare characters in LIFO order.
2. **Deque-Based Strategy**: Uses a `Deque` to compare characters from both ends efficiently.

The implementation follows the **Strategy Design Pattern**, allowing multiple algorithms to check palindromes interchangeably.

## How It Works

### Stack Strategy
1. Push all characters of the input string onto a stack.
2. Pop characters from the stack and compare with the original string.
3. If all match → palindrome.

### Deque Strategy
1. Insert all characters into a `Deque`.
2. Remove characters from **front** and **rear**.
3. Compare them while the deque has more than one element.
4. If all pairs match → palindrome.
