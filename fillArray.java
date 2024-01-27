//Description : Fill an array of n integers entered by the user

package beginner_array_questions;

import java.util.Arrays;
import java.util.Scanner;

public class fillArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements do you want to enter? : ");
        int n = in.nextInt(); // it will decide the length of an array

        int[] arr = new int[n];
        fillArrayOfIntegers(arr);
        printArrayOfIntegers(arr);

    }

    private static void printArrayOfIntegers(int[] arr) {
        System.out.print("Elements are : ");
        System.out.println(Arrays.toString(arr));
    }

    private static void fillArrayOfIntegers(int[] arr) {
        System.out.println("Enter " + arr.length + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextInt();
        }
    }
}
