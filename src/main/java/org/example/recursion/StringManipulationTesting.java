package org.example.recursion;

public class  StringManipulationTesting {

    public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();

        // Test cases for reverseString()
        System.out.println("Testing reverseString()");
        System.out.println("Input: 'abcde', Expected: 'edcba', Result: " + sm.reverseString("abcde"));
        System.out.println("Input: 'hello', Expected: 'olleh', Result: " + sm.reverseString("hello"));
        System.out.println("Input: '', Expected: '', Result: " + sm.reverseString(""));
        System.out.println("Input: 'a', Expected: 'a', Result: " + sm.reverseString("a"));
        System.out.println("Input: 'racecar', Expected: 'racecar', Result: " + sm.reverseString("racecar"));
        System.out.println();

        // Test cases for totalWord()
        System.out.println("Testing totalWord()");
        System.out.println("Input: 'abc', Expected: 294, Result: " + sm.totalWord("abc"));
        System.out.println("Input: 'hello', Expected: 532, Result: " + sm.totalWord("hello"));
        System.out.println("Input: '', Expected: 0, Result: " + sm.totalWord(""));
        System.out.println("Input: 'A', Expected: 65, Result: " + sm.totalWord("A"));
        System.out.println("Input: '123', Expected: 147, Result: " + sm.totalWord("123"));
        System.out.println();

        // Test cases for stringClean()
        System.out.println("Testing stringClean()");
        System.out.println("Input: 'yyyyzzzzxxxx', Expected: 'yzx', Result: " + sm.stringClean("yyyyzzzzxxxx"));
        System.out.println("Input: 'bookkeeper', Expected: 'bokeper', Result: " + sm.stringClean("bookkeeper"));
        System.out.println("Input: '', Expected: '', Result: " + sm.stringClean(""));
        System.out.println("Input: 'aaabbbccc', Expected: 'abc', Result: " + sm.stringClean("aaabbbccc"));
        System.out.println("Input: 'abc', Expected: 'abc', Result: " + sm.stringClean("abc"));
        System.out.println();

        // Test cases for palindromeChecker()
        System.out.println("Testing palindromeChecker()");
        System.out.println("Input: 'abcba', Expected: true, Result: " + sm.palindromeChecker("abcba"));
        System.out.println("Input: 'abc', Expected: false, Result: " + sm.palindromeChecker("abc"));
        System.out.println("Input: '', Expected: true, Result: " + sm.palindromeChecker(""));
        System.out.println("Input: 'a', Expected: true, Result: " + sm.palindromeChecker("a"));
        System.out.println("Input: 'abccba', Expected: true, Result: " + sm.palindromeChecker("abccba"));
        System.out.println();

        // Test cases for permutation()
        System.out.println("Testing permutation()");
        System.out.println("Input: '123'");
        System.out.print("Expected: All possible permutations of '123', Result:");
        sm.permutation("123");
        System.out.println();
        System.out.println("Input: 'ab'");
        System.out.print("Expected: All possible permutations of 'ab', Result:");
        sm.permutation("ab");
        System.out.println();
        System.out.println("Input: 'abcd'");
        System.out.print("Expected: All possible permutations of 'abcd', Result:");
        sm.permutation("abcd");
        System.out.println();
        System.out.println("Input: ''");
        System.out.print("Expected: '', Result:");
        sm.permutation("");
        System.out.println();
    }
}
