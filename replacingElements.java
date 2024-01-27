//Description : write a program that places the odd elements of an array before the even elements
//Example : original array = {1,2,4,5,7,9,-2,3}  So, output should be {1,5,7,9,3,-2,4,2}

package beginner_array_questions;

import java.util.Arrays;

public class replacingElements {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 4, 5, 7, 9, -2, 3 };
        int[] temp = new int[numbers.length]; // created another array with the same length

        int j = 0;
        int k = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                temp[j++] = numbers[i];
            else
                temp[k--] = numbers[i];
        }

        copyArray(numbers, temp);
    }

    private static void copyArray(int[] numbers, int[] temp) {
        System.out.println(Arrays.toString(temp));
    }
}
