//Description : write a program to find maximum & minimum element of an array

package beginner_array_questions;

import java.util.Scanner;

public class maxminElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements do you want to enter? : ");
        int n = in.nextInt(); // it will decide the length of an array

        int[] arr = new int[n];

        // enter the elements
        System.out.println("Enter " + arr.length + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //Assuming that element at index 0 is maximum & minimum 
        int max = arr[0];
        int min = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        //print the maximum & minimum elment
        System.out.println("Maximum element = " + max + " & Minimum element = " + min);
    }
}
