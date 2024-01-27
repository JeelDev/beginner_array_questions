//Description : Display sum , product & average of the elements of an array

package beginner_array_questions;

import java.util.Scanner;

public class calculationOfElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements do you want to enter? : ");
        int n = in.nextInt(); // it will decide the length of an array

        int[] arr = new int[n];
        int sum = 0;
        int product = 1;

        System.out.println("Enter " + arr.length + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextInt();
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("sum = " + sum + " product = " + product + " average = " + sum / n);
    }
}
