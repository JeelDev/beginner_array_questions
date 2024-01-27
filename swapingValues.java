//Description : write a program to swap two numbers in array

package beginner_array_questions;

import java.util.Arrays;
import java.util.Scanner;

public class swapingValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two indicies do you want to replace : ");

        System.out.print("Enter index 1 : ");
        int n1 = in.nextInt();
        System.out.print("Enter index 2 : ");
        int n2 = in.nextInt();

        int[] arr = { 1, 3, 23, 9, 18 };
        swap(arr, n1, n2);

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
