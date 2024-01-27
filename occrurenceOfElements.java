//Description : write a program to check the number of occurences of entered element by the user

package beginner_array_questions;

import java.util.Scanner;

public class occrurenceOfElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements do you want to enter? : ");
        int n = in.nextInt(); // it will decide the length of an array

        int[] arr = new int[n];
        fillArrayOfIntegers(arr); // Call the function to fill the array with user-input values

        System.out.print("Enter the digit to find occurrences: ");
        int targetDigit = in.nextInt();

        // Call the function to count occurence of targeted digit
        int occurrences = countOccurrence(arr, targetDigit);

        // diplay the result
        System.out.println("The digit " + targetDigit + " occurs " + occurrences + " times in the array.");
    }

    private static void fillArrayOfIntegers(int[] arr) {
        System.out.println("Enter " + arr.length + " elements : ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    private static int countOccurrence(int[] arr, int targetDigit) {
        int count = 0;
        // Iterate through each element in the array
        for (int num : arr) {
            // Check if the current element is equal to the target digit
            if (num == targetDigit) {
                count++; // Increment the count if a match is found
            }
        }
        return count; // Return the total count of occurrences
    }
}
