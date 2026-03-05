# Deque-Based Optimized Palindrome Checker

## Overview

This feature demonstrates how to validate whether a string is a **palindrome** using a **Deque (Double Ended Queue)**.

A palindrome is a word, phrase, or sequence that reads the same forward and backward.

## Goal

Use a **Deque data structure** to compare characters from the **front and rear** of a string efficiently.

---

## Data Structure Used

### Deque (Double Ended Queue)

A Deque allows insertion and removal of elements from **both ends**.

Operations used in this implementation:

| Operation     | Description                      |
| ------------- | -------------------------------- |
| addLast()     | Adds character to the rear       |
| removeFirst() | Removes character from the front |
| removeLast()  | Removes character from the rear  |

---

## Algorithm

1. Read the input string.
2. Insert each character into a **Deque**.
3. Compare:

   * First element (front)
   * Last element (rear)
4. If characters match, continue comparison.
5. If any pair does not match → **Not a palindrome**.
6. If all pairs match → **Palindrome**.

---

## Key Learning

This implementation shows how **Deque enables symmetric comparison** efficiently using a single data structure instead of separate **Stack and Queue**.

---

## Author

SIDPAW1508
