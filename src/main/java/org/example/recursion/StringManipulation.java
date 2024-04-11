package org.example.recursion;

import java.util.Scanner;

public class StringManipulation {

    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public int totalWord(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return str.charAt(0) + totalWord(str.substring(1));
    }

    public String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

    public boolean palindromeChecker(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return palindromeChecker(str.substring(1, str.length() - 1));
    }

    public void permutationHelper(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(" " + prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutationHelper(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }

    public void permutation(String str) {
        permutationHelper("", str);
    }

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String input;
        boolean exit = false;

        do {
            // Display menu options
            System.out.println("\nString Manipulation Menu:");
            System.out.println("1. Reverse String");
            System.out.println("2. Calculate Total ASCII Sum");
            System.out.println("3. Clean String");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Generate Permutations");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            // Handle user choice
            switch (choice) {
                case 1:
                    // Reverse String
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Reversed String: " + reverseString(input));
                    break;

                case 2:
                    // Calculate Total ASCII Sum
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Total ASCII Sum: " + totalWord(input));
                    break;

                case 3:
                    // Clean String
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Cleaned String: " + stringClean(input));
                    break;

                case 4:
                    // Check Palindrome
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Is Palindrome? " + palindromeChecker(input));
                    break;

                case 5:
                    // Generate Permutations
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Permutations of " + input + ":");
                    permutation(input);
                    System.out.println();
                    break;

                case 6:
                    // Exit
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!exit);

        scanner.close();
        System.out.println("Exiting the program. Goodbye!");
    }
}
